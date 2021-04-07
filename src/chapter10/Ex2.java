package chapter10;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Ex2 {

	public static void main(String[] args) {
		String protocol = "http://";
		String host = "www.ddaily.co.kr/";
		String path = "data/photos/cdn/20210104/";
		String resource = "art_1611539583.jpg";
		String queryString = "?referer=naver";
		String anchor = "#index";
		
		try {
			URL url = new URL(protocol + host + path + queryString + anchor);
			
			System.out.println("getAuthority() = "+url.getAuthority());
			System.out.println("getContent() = "+url.getContent());
			System.out.println("getDefaultPort() = "+url.getDefaultPort());
			System.out.println("getPort() = "+url.getPort());
			System.out.println("getFile() = "+url.getFile());
			System.out.println("getHost() = "+url.getHost());
			System.out.println("getPath() = "+url.getPath());
			System.out.println("getProtocol() = "+url.getProtocol());
			System.out.println("getQuery() = "+url.getQuery());
			System.out.println("getRef() = "+url.getRef());
			System.out.println("getUserInfo() ="+url.getUserInfo());
			System.out.println("toExternalForm() = "+url.toExternalForm());
			System.out.println("toURI() = "+url.toURI());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		

	}

}
