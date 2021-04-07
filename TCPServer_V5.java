package chapter1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer_V5 {

	public static void main(String[] args) {
		ServerSocket serverSocekt = null;
		Socket socket = null;
		
		try {
			serverSocekt = new ServerSocket(7777);
			System.out.println("������ �غ�Ǿ����ϴ�");
			
			socket = serverSocekt.accept();
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
