package chapter10;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Ex3 {

	public static void main(String[] args) {
		URL url = null;
		String IPAddress = "https://www.youtube.com";
		
		try {
			url = new URL(IPAddress);
			URLConnection conn = url.openConnection();
			
			System.out.println("conn = "+conn);
			// 연결 정보 출력
			System.out.println(conn.getAllowUserInteraction());
			// 연결 종료까지 남은 시간
			System.out.println(conn.getContent());
			System.out.println(conn.getContentLength());
			System.out.println(conn.getContentType());
			// 연결된 자원의    
			System.out.println(conn.getDate());
			System.out.println(conn.getDoInput());
			System.out.println(conn.getDoOutput());
			// 연결된 자원의 만료기간
			System.out.println(conn.getExpiration());
			System.out.println(conn.getIfModifiedSince());
			// 연결된 자원의 마지막 수정 날짜
			System.out.println(conn.getLastModified());
			System.out.println(conn.getReadTimeout());
			System.out.println(conn.getURL());
			System.out.println(conn.getUseCaches());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
