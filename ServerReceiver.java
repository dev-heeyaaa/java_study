package chapter2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerReceiver extends Thread{
	Socket socket;
	DataInputStream in;
	DataOutputStream out;

	public ServerReceiver(Socket socket) {
		this.socket = socket;

		try {
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	public void run() {
		String name = "";

		try {
			name = in.readUTF();
			TCPMultichatServer.sendToAll("#"+name+"���� ���Դ�");
			TCPMultichatServer.clients.put(name, out);
			System.out.println("���� ���� ���� ������ ���� "+TCPMultichatServer.clients.size()+"���Դϴ�");

			while(in != null) {
				TCPMultichatServer.sendToAll(in.readUTF());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			TCPMultichatServer.sendToAll("#"+name+"���� �������ϴ�");

			TCPMultichatServer.clients.remove(name);
			System.out.println("���� ä�� ���� ������ ���� "+TCPMultichatServer.clients.size()+"�Դϴ�.");
		}
	}
}
