package chapter5;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("���� �Է�(����:1/ ����:2): ");		
		int genderValue = scanf.nextInt();
		scanf.close();
		
		Gender gender = Gender.getGender(genderValue);
					
		switch (gender) {
		case MALE:
			System.out.println("������ ���� ���� ����");
			break;

		case FEMALE:
			System.out.println("������ ���� ���� ����");
			break;
		}

	}

}
