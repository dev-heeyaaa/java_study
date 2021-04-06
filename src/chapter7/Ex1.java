package chapter7;

public class Ex1 {

	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread());
		
		thread.start();
		// 쓰레드를 두번 째 실행했을 때 에러가 나오는 이유
		// 쓰레드는 일회용! 재사용은 안된다잇.
		
		thread = new Thread(new MyThread());
		thread.start();
	}

}
