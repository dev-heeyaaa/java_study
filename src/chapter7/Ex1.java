package chapter7;

public class Ex1 {

	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread());
		
		thread.start();
		// �����带 �ι� ° �������� �� ������ ������ ����
		// ������� ��ȸ��! ������ �ȵȴ���.
		
		thread = new Thread(new MyThread());
		thread.start();
	}

}
