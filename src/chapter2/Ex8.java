package chapter2;

import java.time.LocalDate;

public class Ex8 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		System.out.println("올해 = "+date.getYear());
		
		System.out.println("이번달 = "+date.getMonthValue());
		System.out.println("이번 달 = "+date.getMonth());
		
		System.out.println("오늘의 날짜 = "+date.getDayOfMonth());
		
		System.out.println("1월1일부터 경과한 일 수 = "+date.getDayOfYear());
		System.out.println("오늘의 요일 = "+date.getDayOfWeek());
		
		System.out.println("이번 달의 수 "+date.lengthOfMonth());
		System.out.println("이번 해의 수 "+date.lengthOfYear());
		System.out.println("올해의 윤년 여부 "+date.isLeapYear());
	}

}
