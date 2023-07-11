package scrapperUtil;


import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.ProxySelector;
import java.net.URI;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.InetSocketAddress;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.security.NoSuchAlgorithmException;


import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;

import scrapperModel.CustomHeader;

public class CustomHttpClient {
	
//	private ConnectionSettings connectionSettings;
	
	
	public HttpClient createClientWithProxy(ConnectionSettings connectionSettings) {
		
		HttpClient httpClient = null;
		
		CookieManager cookieManager = new CookieManager();
		
		cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
		
		try {
			httpClient = HttpClient
					.newBuilder()
					.authenticator(new Authenticator() {

						@Override
						protected PasswordAuthentication getPasswordAuthentication() {

							if (getRequestorType().equals(RequestorType.PROXY)) {

								return getPasswordAuthentication(getRequestingHost(), getRequestingPort());

							} else {

								return null;

							}

						}

						protected PasswordAuthentication getPasswordAuthentication(String host, int port) {

							if (connectionSettings.getProxyHost().equals(host) && connectionSettings.getProxyPort() == port) {

								return new PasswordAuthentication(connectionSettings.getProxyUsername(),
										connectionSettings.getProxyPassword().toCharArray());

							} else

								return null;
						}
						
					})
					.cookieHandler(cookieManager)
					.proxy(ProxySelector.of(new InetSocketAddress(connectionSettings.getProxyHost(),connectionSettings.getProxyPort())))
					.followRedirects(HttpClient.Redirect.NORMAL)
//					.connectTimeout(Duration.ofSeconds(10))
					.sslContext(SSLContext.getDefault())
					.sslParameters(new SSLParameters())
					.version(HttpClient.Version.HTTP_2)
					.build();
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return httpClient;
		
	}
	
	public HttpClient createClient(ConnectionSettings connectionSettings) {
		
		HttpClient httpClient = null;
		
		CookieManager cookieManager = new CookieManager();
		
		cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
		
		try {
			httpClient = HttpClient
					.newBuilder()
					.cookieHandler(cookieManager)
					.followRedirects(HttpClient.Redirect.NORMAL)
//					.connectTimeout(Duration.ofSeconds(10))
					.sslContext(SSLContext.getDefault())
					.sslParameters(new SSLParameters())
					.version(HttpClient.Version.HTTP_2)
					.build();
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return httpClient;
		
	}
	

	public HttpRequest buildRequest(URI uri) {
		
		CustomHeader customHeader = new CustomHeader();
		
		HttpRequest httpRequest = HttpRequest.newBuilder(uri)
//				.header("authority" , customHeader.getAuthority())
				.header("method", customHeader.getMethod())
//				.header("path", customHeader.getPath())
				.header("scheme", customHeader.getScheme())
				.header("accept", customHeader.getAccept())
				.header("accept-encoding", customHeader.getAcceptencoding())
				.header("accept-language", customHeader.getAcceptlanguage())
				.header("cache-control", customHeader.getCachecontrol())
//				.header("Cache-Control", customHeader.getCacheControl())
//				.header("referer", customHeader.getReferer())
				.header("sec-ch-ua", customHeader.getSecchua())
				.header("sec-ch-ua-mobile", customHeader.getSecchuamobile())
				.header("sec-ch-ua-platform", customHeader.getSecchuaplatform())
				.header("sec-fetch-dest", customHeader.getSecfetchdest())
				.header("sec-fetch-mode", customHeader.getSecfetchmode())
				.header("sec-fetch-site", customHeader.getSecfetchsite())
				.header("upgrade-insecure-requests", customHeader.getUpgradeinsecurerequests())
				.header("user-agent", customHeader.getUseragent())
				.build();
		
		return httpRequest;
		
	}

}
