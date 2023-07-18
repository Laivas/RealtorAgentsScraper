package scrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import lombok.Getter;
import lombok.Setter;
import scrapperDatabase.SqliteDatabaseConnection;
import scrapperUtil.ConnectionSettings;
import scrapperUtil.CustomHttpConnection;
import scrapperUtil.InputStreamDecoder;
import scrapperUtil.PausableExecutorService;
import scrapperUtil.ProxyUtil;

@Setter
@Getter
public abstract class Scrapper {

	private boolean pause;

	private boolean running;

	private int delayInMs;

	private int numberOfThreads;

	private ProxyUtil proxyUtil;

	private Map<String, String> headers;

	private Path writeToPath;

	private SqliteDatabaseConnection sqliteDatabaseConnection;

	private PausableExecutorService executorService;
	
	public InputStreamDecoder inputStreamDecoder;

	public abstract void start();

	public Scrapper() {

	}

	public void stop() {

		setPause(false);

		setRunning(false);

	};

	public void pause() {

		setPause(true);

		pauseResume();

	}

	public void resume() {

		setPause(false);

		pauseResume();

	}

	public void pauseResume() {

		if (executorService != null) {

			if (isPause() == true) {

				executorService.pause();

			}

			if (isPause() == false) {

				executorService.resume();

			}

		}

	}
	
	public abstract void parseHtmlInFileSystem();

	public String htmlResponse(URL url, ConnectionSettings connectionSettings) {

		try {
			Thread.sleep(getDelayInMs());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CustomHttpConnection connection = new CustomHttpConnection(connectionSettings, url);

		return connection.getHtmlContent();

	}
	
	public void inputStreamWriterToFileSystem(InputStream inputStream, String encoding, String link) {

		if (inputStreamDecoder == null) {

			inputStreamDecoder = new InputStreamDecoder();

		}

		inputStreamDecoder.inputStreamWriterToFileSystem(inputStream, encoding, link);

	}

	public String htmlResponse(URL url) {

		try {
			Thread.sleep(getDelayInMs());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Document doc = null;

		try {
			doc = Jsoup.connect(url.toString()).get();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return doc.html();

	}

	public Document getDocument(String url) {

		try {
			Thread.sleep(getDelayInMs());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Document doc = null;

		try {
			doc = Jsoup.connect(url).headers(getHeaders()).get();

			TimeUnit.MILLISECONDS.sleep(getDelayInMs());

		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return doc;

	}

	public abstract void scrapPageLogic(String html);

	public void scrapPage(Set<URL> pagesRead, List<URL> pagesToBeRead, List<ConnectionSettings> connectionSettings) {

		if (pagesToBeRead.size() > 0 && connectionSettings != null && connectionSettings.size() > 0) {

			URL url = pagesToBeRead.remove(0);

			ConnectionSettings connectionStngs = connectionSettings.remove(0);

			pagesRead.add(url);

			scrapPageLogic(htmlResponse(url, connectionStngs));

			connectionSettings.add(connectionStngs);

		}

		if (pagesToBeRead.size() > 0 && connectionSettings == null) {

			URL url = pagesToBeRead.remove(0);

			scrapPageLogic(htmlResponse(url));

		}

	}
	
	public void processRequestNew(List<HttpRequest> pagesToBeRead, List<HttpClient> httpClients) {

		if (!pagesToBeRead.isEmpty() && !httpClients.isEmpty()) {

			HttpRequest httpRequest = pagesToBeRead.remove(0);

			HttpClient client = httpClients.remove(0);

//			HttpRequest httpRequest = httpClientRequestBuilder.buildRequest(uriPreparator.buildURI(request));

			if (httpRequest != null) {

				client.sendAsync(httpRequest, BodyHandlers.ofInputStream()).thenAcceptAsync(response -> {

					inputStreamWriterToFileSystem(response.body(),
							inputStreamDecoder.determineContentEncoding(response.headers()),
							httpRequest.uri().toString());
					
					parseHtmlInFileSystem();

				});

			}

			httpClients.add(client);

		}

	}

	public void processRequest(List<HttpRequest> pagesToBeRead, List<HttpClient> connectionSettings) {

		Random random = new Random();

		if (pagesToBeRead.size() > 0 && connectionSettings.size() > 0) {

			HttpRequest request = pagesToBeRead.remove(0);

			HttpClient client = connectionSettings.remove(0);

			try {
				
				Thread.sleep(random.nextInt(getDelayInMs()) + getDelayInMs());

				HttpResponse<InputStream> response = client.send(request, BodyHandlers.ofInputStream());
					
					System.out.println(response.statusCode());
					
					inputStreamWriterToFileSystem(response.body(),
							inputStreamDecoder.determineContentEncoding(response.headers()),
							response.uri().toString());
					
					parseHtmlInFileSystem();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			connectionSettings.add(client);

		}

	}

	public String inputStreamWriterToString(InputStream inputStream) {

		String content = "";

		try {
			
			GZIPInputStream gzipStream = new GZIPInputStream(inputStream);

			Reader reader = new InputStreamReader(gzipStream);

			BufferedReader br = new BufferedReader(reader);

			String line = "";

			while ((line = br.readLine()) != null) {

				content += line;

			}

		} catch (

		IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return content;

	}

	public void singleThreadedScrap(List<URL> toBeRead) {

		List<URL> pagesToBeRead = Collections.synchronizedList(toBeRead);

		while (!pagesToBeRead.isEmpty()) {

			if (isRunning() == false) {

				return;

			}

			scrapPage(null, pagesToBeRead, null);

			try {
				TimeUnit.MILLISECONDS.sleep(getDelayInMs());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			parseHtmlInFileSystem();

		}

	}

	public void singleThreadedScraping(List<HttpRequest> toBeRead, List<HttpClient> httpClients) {

		List<HttpRequest> pagesToBeRead = Collections.synchronizedList(toBeRead);

		List<HttpClient> clients = Collections.synchronizedList(httpClients);

		while (!pagesToBeRead.isEmpty()) {

			while (isPause() == true) {

				try {
					Thread.sleep(getDelayInMs());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			if (isRunning() == false) {

				return;

			}

			processRequest(pagesToBeRead, clients);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void multiThreadedScrap(int numberOfThreads, List<URL> toBeRead,
			List<ConnectionSettings> connectionSettings) {

		Set<URL> pagesRead = Collections.synchronizedSet(new HashSet<URL>());

		List<URL> pagesToBeRead = Collections.synchronizedList(toBeRead);

		List<ConnectionSettings> connection = Collections.synchronizedList(connectionSettings);

		executorService = new PausableExecutorService(numberOfThreads);

		Random random = new Random();

		while (!pagesToBeRead.isEmpty()) {

			if (isRunning() == false) {

				executorService.shutdown();

				return;

			}

			executorService.execute(() -> scrapPage(pagesRead, pagesToBeRead, connection));

			try {
				Thread.sleep(random.nextInt(getDelayInMs()) + getDelayInMs());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			parseHtmlInFileSystem();

		}

		executorService.shutdown();

	}

	public void multiThreadedScraping(int numberOfThreads, List<HttpRequest> toBeRead, List<HttpClient> httpClients) {

		List<HttpRequest> pagesToBeRead = Collections.synchronizedList(toBeRead);

		List<HttpClient> connection = Collections.synchronizedList(httpClients);

//		ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

		executorService = new PausableExecutorService(numberOfThreads);

		while (!pagesToBeRead.isEmpty()) {

			if (isRunning() == false) {

				executorService.shutdown();

				return;

			}

			executorService.execute(() -> processRequest(pagesToBeRead, connection));

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			parseHtmlInFileSystem();

		}

		executorService.shutdown();

	}

}
