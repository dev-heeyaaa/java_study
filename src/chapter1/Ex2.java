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
				throw new WrongIndexException("0이상 4이하 아니면 사용 불가");
			}
			System.out.println(val1[index]);
			throw new MyException("MyException 발생");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		} catch (WrongIndexException e) {
			System.out.println(e.getMessage());
		}
	}

}
