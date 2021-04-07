package chapter1;
// 입력과 동시에 출력을 각각의 쓰레드로 나눠처 처리한다
import java.io.IOException;
import java.net.Socket;

public class TCPClient_V2 {

	public static void main(String[] args) {
		try {
			String ServerIp = "127.0.0.1";
			
			Socket socket = new Socket(ServerIp, 7777);
			
			System.out.println("서버에 연결되었습니다");
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
