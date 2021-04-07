package chapter10;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		// Networking
		InetAddress ip = null;
		InetAddress[] ipArray = null;
				
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() = "+ip.getHostName());
			System.out.println("getHostAddress() = "+ip.getHostAddress());
			System.out.println("toString() = "+ip.toString());
			// 도메인: ip주소로 서버에 접근해야 하는데 ip주소는 0~255까지의 4자리 숫자로 이루어져 있으므로 접근성이 떨어짐
			// 숫자를 의미있는 문자로지정해서 사용하는 게 더 편함 
			// [도메인 네임 서비스 ] -> DNS
			
			// IP -> 4자리 숫자로 이루어져있음 / 1Byte
			byte[] ipAddress = ip.getAddress();
			System.out.println("getAddress() = "+Arrays.toString(ipAddress));
			
			// 서브넷마스크 관련
			String result = "";
			for (int i = 0; i < ipAddress.length; i++) {
				result += (ipAddress[i] < 0)? ipAddress[i] + 256: ipAddress[i];
				result += ".";
				
				
			}
			//System.out.println("getAddress() + 256" + result);
			System.out.println("====== ======");
			
			ip = InetAddress.getLocalHost();
			
			System.out.println("getHostNAme() = "+ip.getHostName());
			System.out.println("getHostAddress()"+ip.getHostAddress());
			System.out.println("=====");
			
			ipArray = InetAddress.getAllByName("www.naver.com");
			for (int i = 0; i < ipArray.length; i++) {
				System.out.println("[ipArray"+i+"] = "+ipArray[i]);
			}
			
			
			System.out.println();
		} catch (UnknownHostException e) { // 존재하지 않는 도메인일 수 있으니까
			e.printStackTrace();
		}
	}

}
