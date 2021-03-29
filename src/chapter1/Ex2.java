package chapter1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int[] val1 = new int[5];
		Scanner scanf = new Scanner(System.in);
		
		try {
			
			int index = scanf.nextInt();
			scanf.close();
			if(index < 0 || index > 5) {
				throw new WrongIndexException("0�̻� 4���� �ƴϸ� ��� �Ұ�");
			}
			System.out.println(val1[index]);
			throw new MyException("MyException �߻�");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		} catch (WrongIndexException e) {
			System.out.println(e.getMessage());
		}
	}

}
