package scrapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.*;
import scrapperDatabase.SqliteDatabaseConnection;
import scrapperGeneratedRealtor.Agent;
import scrapperGeneratedRealtor.RealtorsData;
import scrapperModel.RealtorAgentData;
import scrapperUtil.ConnectionSettings;
import scrapperUtil.CsvReaderWriter;
import scrapperUtil.CustomHttpClient;
import scrapperUtil.InputStreamDecoder;
import scrapperUtil.ObjectToJsonWriter;

@Setter
@Getter
public class RealtorScrapper extends Scrapper {

	private int index;

	private int currentPage;

	private int totalPages;

	private int agentsWritten;

	private String[] states = { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
			"Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky",
			"Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri",
			"Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina",
			"North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
			"South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia",
			"Wisconsin", "Wyoming" };

	private String[] statesCodes = { "AL", "AK", "AZ", "AR", "CA", "CZ", "CO", "CT", "DE", "DC", "FL", "GA", "GU", "HI",
			"ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH",
			"NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "PR", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VI",
			"VA", "WA", "WV", "WI", "WY" };

	private String selectedState;

	private String city;

	private String state;

	private String cityState;

	private String mainUrl;

	private List<URL> urls;

	private SqliteDatabaseConnection sqliteDatabaseConnection;

	private CsvReaderWriter csvReaderWriter;
	
	private ObjectToJsonWriter objectToJsonWriter;

	private List<String[]> proxies;

	public RealtorScrapper() {

	}

	public String buildQueryUrl() {

		String queryUrl = buildAgentsSearchUrl(queryPage());

		return queryUrl;

	}

	public void query(String city, String state) {

		String cityState = "";

		if (city.split("\\s+").length == 2) {

			city = city.split("\\s+")[0] + "-" + city.split("\\s+")[1];

		}

		if (state.length() == 2) {

			this.selectedState = state;

		}

		if (state.length() > 2) {

			this.selectedState = Arrays.asList(this.statesCodes).get(Arrays.asList(this.states).indexOf(state));

		}

		cityState = city + "_" + this.selectedState + "/";

		this.cityState = cityState;

	}

	private String buildAgentsSearchUrl(String page) {

		String queryUrl = this.mainUrl + this.cityState + page;

		return queryUrl;

	}

	private String queryPage() {

		String queryPage = "";

		if (getCurrentPage() == 0 && getTotalPages() == 0) {

			this.currentPage++;

			return queryPage = "pg-" + getCurrentPage() + "/";

		}

		if (getCurrentPage() == getTotalPages()) {

			return queryPage = "pg-" + this.totalPages + "/";

		}

		if (getCurrentPage() >= 1 && getCurrentPage() != getTotalPages()) {

			this.currentPage++;

			queryPage = "pg-" + getCurrentPage() + "/";

			return queryPage;

		}

		return queryPage;

	}

	public void buildUrlList() {

		this.urls = new ArrayList<URL>();

		for (int i = 1; i <= this.totalPages; i++) {

			String queryUrl = this.mainUrl + this.cityState + "pg-" + i + "/";

			try {
				urls.add(new URL(queryUrl));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public String currentPage(Document document) {

		Elements elements = document.getElementsByAttributeValue("aria-label", "pagination");

		String currentPage = "";

		for (Element e : elements) {

			if (e.getElementsByAttributeValueContaining("aria-current", "true").size() > 0) {

				Elements ele = e.getElementsByAttributeValueContaining("aria-current", "true");

				currentPage = ele.text();

			}

		}

		this.currentPage = Integer.valueOf(currentPage);

		return currentPage;

	}

	public String totalPages(Document document) {

		Elements elements = document.getElementsByAttributeValue("aria-label", "pagination");

		String totalPages = "";

		for (Element e : elements) {

			if (e.getElementsByAttributeValueContaining("aria-current", "false").size() > 0) {

				Elements ele = e.getElementsByAttributeValueContaining("aria-current", "false");

				totalPages = ele.get(ele.size() - 1).text();

			}

		}

		this.totalPages = Integer.valueOf(totalPages);

		return totalPages;

	}

	public List<RealtorAgentData> scrapPage(String html) {

		Document doc = Jsoup.parse(html);

		Elements elements = doc.getElementsByAttributeValue("type", "application/json");

		RealtorsData realtorData = listOfRealtor(elements.first().data());

		if (realtorData != null) {

			List<Agent> agents = realtorData.getProps().getPageProps().getPageData().getAgents();

			List<RealtorAgentData> realtorAgentsData = new ArrayList<RealtorAgentData>();

			for (Agent agent : agents) {

				RealtorAgentData realtorAgentData = new RealtorAgentData();

				realtorAgentData.setSearchQuery(getCityState());

				if (agent.getFullName() == null) {

					if (agent.getPersonName() != null) {

						realtorAgentData.setFullName(agent.getPersonName());

					}

				}

				if (agent.getFullName() != null) {

					realtorAgentData.setFullName(agent.getFullName());

				}

				if (agent.getHref() != null) {

					realtorAgentData.setWebsite(agent.getHref());

				}

				if (agent.getPhones() != null) {

					if (agent.getPhones().size() == 1) {

						realtorAgentData.setPhone1(agent.getPhones().get(0).getNumber());

					}

					if (agent.getPhones().size() == 2) {

						realtorAgentData.setPhone1(agent.getPhones().get(0).getNumber());

						realtorAgentData.setPhone2(agent.getPhones().get(1).getNumber());

					}

					if (agent.getPhones().size() == 3) {

						realtorAgentData.setPhone1(agent.getPhones().get(0).getNumber());

						realtorAgentData.setPhone2(agent.getPhones().get(1).getNumber());

						realtorAgentData.setPhone3(agent.getPhones().get(2).getNumber());

					}

				}

				if (agent.getSocialMedia() != null) {

					if (agent.getSocialMedia().getFacebook() != null) {

						realtorAgentData.setFacebook(agent.getSocialMedia().getFacebook().getHref());

					}

					if (agent.getSocialMedia().getTwitter() != null) {

						realtorAgentData.setTwitter(agent.getSocialMedia().getTwitter().getHref());

					}

				}

				realtorAgentsData.add(realtorAgentData);

			}

		return realtorAgentsData;
		
		}
		
		return null;

	}

	@Override
	public void scrapPageLogic(String html) {

		List<RealtorAgentData> agentsData = scrapPage(html);
		
		if(agentsData != null) {

		if (sqliteDatabaseConnection != null) {

			for (RealtorAgentData realtorAgentData : agentsData) {

				sqliteDatabaseConnection.insertIntoDatabase(realtorAgentData);

			}

		}

		if (sqliteDatabaseConnection == null && objectToJsonWriter == null) {

			for (RealtorAgentData realtorAgentData : agentsData) {

				csvReaderWriter.writeArrayLineToCsv(realtorAgentData.fieldsValuesToArray(), getWriteToPath());

			}

		}
		
		if (objectToJsonWriter != null) {
			
			for (RealtorAgentData realtorAgentData : agentsData) {
				
				objectToJsonWriter.writeRealtorAgentDataJsonFile(realtorAgentData, getWriteToPath());
				
			}
			
		}

		agentsWritten += agentsData.size();

		}
		
	}

	public RealtorsData listOfRealtor(String json) {

		RealtorsData agent = null;

		ObjectMapper mapper = new ObjectMapper();

		try {
			agent = mapper.readValue(json, RealtorsData.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return agent;

	}

	public void totalNumberOfPages(HttpClient httpClient, URI uri) {

		CustomHttpClient customHttpClient = new CustomHttpClient();

		HttpRequest httpRequest = customHttpClient.buildRequest(uri);

		try {
			HttpResponse<InputStream> response = httpClient.send(httpRequest, BodyHandlers.ofInputStream());

			totalPages(Jsoup.parse(inputStreamWriterToString(response.body())));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void start() {

		setRunning(true);

		System.setProperty("jdk.httpclient.allowRestrictedHeaders", "Connection");
		System.setProperty("jdk.http.auth.proxying.disabledSchemes", "");
		System.setProperty("jdk.http.auth.tunneling.disabledSchemes", "");

		List<HttpRequest> httpRequests = new ArrayList<HttpRequest>();

		List<HttpClient> httpClients = new ArrayList<HttpClient>();

		setMainUrl("https://www.realtor.com/realestateagents/");

		csvReaderWriter = new CsvReaderWriter();

		super.inputStreamDecoder = new InputStreamDecoder();

		if (proxies != null) {

			for (String[] line : proxies) {

				ConnectionSettings connectionSettings = new ConnectionSettings();

				CustomHttpClient customHttpClient = new CustomHttpClient();

				connectionSettings.setProxyHost(line[0]);

				connectionSettings.setProxyPort(Integer.valueOf(line[1]));

				connectionSettings.setProxyUsername(line[2]);

				connectionSettings.setProxyPassword(line[3]);

				httpClients.add(customHttpClient.createClientWithProxy(connectionSettings));

			}
			System.out.println(getMainUrl() + getCityState());
			try {
				totalNumberOfPages(httpClients.get(0), new URI(getMainUrl() + getCityState()));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			buildUrlList();

			for (URL url : urls) {

				CustomHttpClient customHttpClient = new CustomHttpClient();

				try {
					httpRequests.add(customHttpClient.buildRequest(url.toURI()));
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			multiThreadedScraping(getNumberOfThreads(), httpRequests, httpClients);

		}

		if (proxies == null) {

			ConnectionSettings connectionSettings = new ConnectionSettings();

			CustomHttpClient customHttpClient = new CustomHttpClient();

			httpClients.add(customHttpClient.createClient(connectionSettings));

			try {
				totalNumberOfPages(httpClients.get(0), new URI(getMainUrl() + getCityState()));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			buildUrlList();

			for (URL url : urls) {

				try {
					httpRequests.add(customHttpClient.buildRequest(url.toURI()));
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			singleThreadedScraping(httpRequests, httpClients);

		}

		setRunning(false);

		if (getSqliteDatabaseConnection() != null) {

			getSqliteDatabaseConnection().sessionClose();

		}

	}

	@Override
	public void parseHtmlInFileSystem() {

		String tempFolder = System.getProperty("user.home").replaceAll("\\\\", "/") + "/Realtor Agents Scraper/temp/";

		File[] files = new File(tempFolder).listFiles(file -> file.getName().contains(".html"));

		if (files.length > 0) {

			for (File file : files) {

				try {

					scrapPageLogic(Jsoup.parse(file).html());

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println(file.getName() + " writen.");

				file.delete();

				System.out.println("deleted.");

			}

		}

	}

}
