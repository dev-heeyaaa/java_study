package chapter2;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPMultichatClient {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage: java chapter2.TCPMultichatClient ID");
			System.exit(0); // ���� ���� ���ٸ� ���α׷��� ������Ѷ�
			
		}
		try {
		String serverIP = "127.0.0.1";
		
		Socket socket = new Socket(serverIP, 7777);// 7777 ��Ʈ�� ������ ����
		System.out.println("������ ����Ǿ����ϴ�.");
		
		Thread sender = new Thread(new ClientSender(socket, args[0]));
		// sender�� �̿��ؼ� ������ args[0]�� �����ؼ� ��������,
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
