package chapter1;

import java.util.Scanner;

public class Ex1 {
	static String text;

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int val1 =10;
		int val2 = 1;

		int[] val3 = new int[4];

		try {
			//			System.out.println(val1/--val2);
			int index = scanf.nextInt();

			System.out.println(val3[index]);

			char c = Ex1.text.charAt(0);
			scanf.close();

			// System.out.println("try ��");

			// throw -> ���ܸ� �ǵ������� �߻���Ű�� Ű����
			throw new MyException("�ǵ������� �߻���Ų ����");

		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ������ ������ϴ�.");
			System.out.println("�迭�� ������ ��Ҹ� ����մϴ�.");

			System.out.println(e.getMessage());

			// ����Ϸ��� �迭�� ������ ��� ���
			System.out.println(val3[val3.length-1]);

		} catch(ArithmeticException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");

		}
		catch(MyException e) {
			System.out.println("���� ���� ���� �޽���: " + e.getMessage());
			System.out.println("���� ���� ���ܰ� �߻�����");
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException �߻�"); 

		}
		

		finally { // ���ܰ� �߻��ϵ� �߻����� �ʵ� ����!
			System.out.println("Finally �ڵ� ����");
		}

		int result = val1 + val2;
		System.out.println(result);
	}

}