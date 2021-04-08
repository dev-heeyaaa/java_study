package chapter2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientSender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;

	public ClientSender(Socket socket, String name) {
		this.socket = socket;

		try {
			out = new DataOutputStream(socket.getOutputStream());
			this.name = name;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		Scanner scanf = new Scanner(System.in);


		try {
			if(out != null) {
			}
			while(out != null) {
				out.writeUTF("["+name+"]"+scanf.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


		scanf.close();


	}
}
