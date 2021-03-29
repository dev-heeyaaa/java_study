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

			// System.out.println("try 끝");

			// throw -> 예외를 의도적으로 발생시키는 키워드
			throw new MyException("의도적으로 발생시킨 예외");

		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
			System.out.println("배열의 마지막 요소를 출력합니다.");

			System.out.println(e.getMessage());

			// 사용하려는 배열의 마지막 요소 출력
			System.out.println(val3[val3.length-1]);

		} catch(ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");

		}
		catch(MyException e) {
			System.out.println("내가 만든 예외 메시지: " + e.getMessage());
			System.out.println("내가 만든 예외가 발생했음");
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException 발생"); 

		}
		

		finally { // 예외가 발생하든 발생하지 않든 실행!
			System.out.println("Finally 코드 실행");
		}

		int result = val1 + val2;
		System.out.println(result);
	}

}
