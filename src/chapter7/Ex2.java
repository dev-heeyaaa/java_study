package chapter7;

public class Ex2 {

	public static void main(String[] args) {
		// �̱� ������ ���Ѥýñ�
		Thread thread = new Thread(new MyThread1());
		// �̱۽����� 2���� �۾��� �ҿ��ϴµ� �ɸ� �ð� = 450��
		thread.start();
		

		

	}

}
