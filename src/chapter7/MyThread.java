package chapter7;

//Ŭ���� ���� -> Ʋ
//������ ���� -> �������� Ʋ
//�̸��� thread�� ���� �����尡 �ƴ϶� runnable�� implements�� �ؼ�,
public class MyThread implements Runnable{
	@Override
	public void run() {
		// �����尡 �����ؾߵ� �ð�
		
		try {
			int result = 10/0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("���� �߻�!");
		}

	}
}
