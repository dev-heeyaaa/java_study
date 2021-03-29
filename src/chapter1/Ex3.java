package chapter1;
// �޼��忡�� ���ܰ� �߻����� ����?
public class Ex3 {
	static double div(int val1, int val2) {
		try {
			double result = val1 / val2;
			
			return result;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
			return 0;
		}
		
		
	}
	static int readArrayElement(int index) throws ArrayIndexOutOfBoundsException{
		// WrongIndexException ���ܴ� �����ο��� ó���� �ϰ�
		// ArrayIndexOutofCoundsException ���ܴ� �޼��带 ȣ���� �ʿ��� ó���ϵ���
		try {
			int array[] = {9, 8, 7};
			
			if(index < 0) {
				throw new WrongIndexException("�ε����� 0 �Ǵ� ���� ������ ����");
			}
			return array[index];
		} catch (WrongIndexException e) {
			System.out.println(e.getMessage());
			
			return 0;
		}
		
	}
	static void makeException() throws MyException{
		System.out.println("makeException ����");
		
		throw new MyException("���� ���� ���� �߻�");
		
	}
	public static void main(String[] args) {
		double result1 = div(10, 0);
		System.out.println(result1);
		try {
		int result2 = readArrayElement(3);
		System.out.println(result2);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
			makeException();
		} catch (MyException e) {
			System.out.println("makeException �޼��尡 ���ܸ� ����");
		}
		
		
			
	}

}
