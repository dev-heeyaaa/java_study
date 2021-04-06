package chapter5;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("성별 입력(남성:1/ 여성:2): ");		
		int genderValue = scanf.nextInt();
		scanf.close();
		
		Gender gender = Gender.getGender(genderValue);
					
		switch (gender) {
		case MALE:
			System.out.println("남성의 위한 쿠폰 지급");
			break;

		case FEMALE:
			System.out.println("여성을 위한 쿠폰 지급");
			break;
		}

	}

}
