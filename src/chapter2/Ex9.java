package chapter2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex9 {

	public static void main(String[] args) {
//		LocalTime time = LocalTime.now();
//		LocalDate date = LocalDate.now();
		
		LocalDate today = LocalDate.now();
		LocalDate yesterday = today.minusDays(1);
		
		// 날짜 비교
		System.out.println(today.isAfter(yesterday)); // today가 yesterday의 후인가요? -> true (today가 기준)
		System.out.println(today.isBefore(yesterday));// today가 yesterday의 전인가요? -> false (today가 기준)
		
		System.out.println(yesterday.isAfter(today));// yesterday가 today의 후인가요? -> false (yesterday가 기준)
		System.out.println(yesterday.isBefore(today));// yesterday가 today의 전인가요? -> true (yesterday가 기준)
		
		
		
//		System.out.println(date.plusYears(1)); 
//		System.out.println(date.plusMonths(5));
//		System.out.println(date.plusDays(21));
//		
//		System.out.println(time.plusHours(2));
//		
//		System.out.println(date.minusYears(1));
		
		// 객체가 가지고있는 날짜 자체를 바꾸는 게 아니고
		// date 객체의 YEAR 필드값을 2022로 바꿔라
		// date 객체가 갖고있던 월, 일 값은 그대로 유지하고 YEAR의 필드값만 2022로 바꿔서\
		// year - 2022, month - date 객체가 갖고있던 월, date - date 객체가 갖고있던 일/을 갖고있는
		// 새로운 LocalDate 객체를 반환		
//		LocalDate newDate =  date.with(ChronoField.YEAR, 2022);
//		System.out.println(newDate);
//		
//		System.out.println(date.with(ChronoField.MONTH_OF_YEAR, 7));
//		System.out.println(date.with(ChronoField.DAY_OF_MONTH, 21));
//		System.out.println(time.with(ChronoField.HOUR_OF_DAY, 11));
//		System.out.println(time.with(ChronoField.MINUTE_OF_DAY, 38));
//		System.out.println(time.with(ChronoField.SECOND_OF_DAY, 7));
		
		
//		System.out.println("시: "+time.getHour());
//		System.out.println("분: "+time.getMinute());
//		System.out.println("초: "+time.getSecond());
		
		
	}

}
