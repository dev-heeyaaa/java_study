package chapter2;

import java.time.LocalDate;

public class Ex8 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		System.out.println("���� = "+date.getYear());
		
		System.out.println("�̹��� = "+date.getMonthValue());
		System.out.println("�̹� �� = "+date.getMonth());
		
		System.out.println("������ ��¥ = "+date.getDayOfMonth());
		
		System.out.println("1��1�Ϻ��� ����� �� �� = "+date.getDayOfYear());
		System.out.println("������ ���� = "+date.getDayOfWeek());
		
		System.out.println("�̹� ���� �� "+date.lengthOfMonth());
		System.out.println("�̹� ���� �� "+date.lengthOfYear());
		System.out.println("������ ���� ���� "+date.isLeapYear());
	}

}
