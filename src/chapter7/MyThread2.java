package chapter7;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		long start = System.currentTimeMillis();
		
		int count = 0;
		for (int i = 0; i < 100000; i++) {
			count++;
			
			if(count%50==0) {
				System.out.println();
			}
			System.out.println("-");
		}
		
		long end = System.currentTimeMillis();
		
		long time = end - start;
		System.out.println("�ҿ�ð�1: "+time);
		
	}
	
}
