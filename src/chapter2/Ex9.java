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
		
		// ��¥ ��
		System.out.println(today.isAfter(yesterday)); // today�� yesterday�� ���ΰ���? -> true (today�� ����)
		System.out.println(today.isBefore(yesterday));// today�� yesterday�� ���ΰ���? -> false (today�� ����)
		
		System.out.println(yesterday.isAfter(today));// yesterday�� today�� ���ΰ���? -> false (yesterday�� ����)
		System.out.println(yesterday.isBefore(today));// yesterday�� today�� ���ΰ���? -> true (yesterday�� ����)
		
		
		
//		System.out.println(date.plusYears(1)); 
//		System.out.println(date.plusMonths(5));
//		System.out.println(date.plusDays(21));
//		
//		System.out.println(time.plusHours(2));
//		
//		System.out.println(date.minusYears(1));
		
		// ��ü�� �������ִ� ��¥ ��ü�� �ٲٴ� �� �ƴϰ�
		// date ��ü�� YEAR �ʵ尪�� 2022�� �ٲ��
		// date ��ü�� �����ִ� ��, �� ���� �״�� �����ϰ� YEAR�� �ʵ尪�� 2022�� �ٲ㼭\
		// year - 2022, month - date ��ü�� �����ִ� ��, date - date ��ü�� �����ִ� ��/�� �����ִ�
		// ���ο� LocalDate ��ü�� ��ȯ		
//		LocalDate newDate =  date.with(ChronoField.YEAR, 2022);
//		System.out.println(newDate);
//		
//		System.out.println(date.with(ChronoField.MONTH_OF_YEAR, 7));
//		System.out.println(date.with(ChronoField.DAY_OF_MONTH, 21));
//		System.out.println(time.with(ChronoField.HOUR_OF_DAY, 11));
//		System.out.println(time.with(ChronoField.MINUTE_OF_DAY, 38));
//		System.out.println(time.with(ChronoField.SECOND_OF_DAY, 7));
		
		
//		System.out.println("��: "+time.getHour());
//		System.out.println("��: "+time.getMinute());
//		System.out.println("��: "+time.getSecond());
		
		
	}

}
