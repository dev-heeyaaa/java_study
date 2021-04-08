package chapter2;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPMultichatClient {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage: java chapter2.TCPMultichatClient ID");
			System.exit(0); // 받은 값이 없다면 프로그램을 종료시켜라
			
		}
		try {
		String serverIP = "127.0.0.1";
		
		Socket socket = new Socket(serverIP, 7777);// 7777 포트로 서버에 연결
		System.out.println("서버에 연결되었습니다.");
		
		Thread sender = new Thread(new ClientSender(socket, args[0]));
		// sender를 이용해서 서버에 args[0]을 연결해서 보내려고,
		Thread receiver = new Thread(new ClientReceiver(socket));
		sender.start();
		receiver.start();
		} catch(ConnectException e){
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
