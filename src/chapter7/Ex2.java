package chapter7;

public class Ex2 {

	public static void main(String[] args) {
		// 싱글 쓰레드 무ㅡㅓ시기
		Thread thread = new Thread(new MyThread1());
		// 싱글스레드 2개의 작업을 소요하는데 걸린 시간 = 450초
		thread.start();
		

		

	}

}
