package chapter5;

import java.util.Scanner;

public class EEx2 {

	public static void main(String[] args) {
//		String birth = "Jan";
//
//		// 매개변수로 상수의 이름을 전달해서
//		// 매개변수로 전달받은 이름을 가지고 있는 상수를 찾을 수 있음
//		BirthMonth birthMonth = BirthMonth.valueOf(birth);
//
//		System.out.println(birthMonth);

//		try {
//			// String birth1 = "jan";
//			BirthMonth[] birthMonthArr = BirthMonth.values();
//	
//			for (BirthMonth birthMonth2 : birthMonthArr) {
//				System.out.println(birthMonth2 + " = "+birthMonth2.getKorMonth());
//			}
//			
//			
//			
//		} catch (IllegalArgumentException e) {
//			System.out.println("존재하지 않는 상수입니다.");
//		}
//		
		Scanner scanf = new Scanner(System.in);
		System.out.print("월 입력: ");
		
		String input = scanf.next();
		
		BirthMonth[] birthMonthArr = BirthMonth.values();


	}

}
