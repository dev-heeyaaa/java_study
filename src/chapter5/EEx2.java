package chapter5;

import java.util.Scanner;

public class EEx2 {

	public static void main(String[] args) {
//		String birth = "Jan";
//
//		// �Ű������� ����� �̸��� �����ؼ�
//		// �Ű������� ���޹��� �̸��� ������ �ִ� ����� ã�� �� ����
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
//			System.out.println("�������� �ʴ� ����Դϴ�.");
//		}
//		
		Scanner scanf = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		
		String input = scanf.next();
		
		BirthMonth[] birthMonthArr = BirthMonth.values();


	}

}
