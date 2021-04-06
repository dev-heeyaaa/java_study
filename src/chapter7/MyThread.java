package chapter7;

//클래스 정의 -> 틀
//쓰레드 정의 -> 쓰레드의 틀
//이름에 thread가 들어가서 쓰레드가 아니라 runnable을 implements을 해서,
public class MyThread implements Runnable{
	@Override
	public void run() {
		// 쓰레드가 수행해야될 시간
		
		try {
			int result = 10/0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("예외 발생!");
		}

	}
}
