package chapter2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Ex13 {
	public static String toString(LocalDate date) {
		String year = date.getYear() + "��";
		String month = date.getMonthValue() + "��";
		String day = date.getDayOfMonth()+ "��";
		
		return year + " " + month + " " + day;
	}
	public static void main(String[] args) {
		LocalTime time1 = LocalTime.of(0, 0, 0);
		LocalTime time2 = LocalTime.of(9, 12, 34);
		
		// �� ���� ���̸� �� �� ����!
		Duration duration = Duration.between(time1, time2);
		
		//�� ���� ����
		long second = duration.get(ChronoUnit.SECONDS);
		
		// ������ ���� ����/ �и���(1/1000), ����ũ����(1/1000000), ������(1/1000000000) ������ �۾���
		long nano = duration.get(ChronoUnit.NANOS);
		
		
		System.out.println(second);
		System.out.println(nano);
		// <���� �� ��>
//		long time = second / 3600;
//		long minute = (second % 3600) / 60;
//		long second2 = (second % 3600) % 60;
		
//		System.out.println(time+"�ð� "+minute+"�� "+second2+"�� ���̰� ���ϴ�.");
		
		// <����� ��>
		long hour = second / 3600;
		long minute = (second - (hour * 3600)) / 60;
		second = second - (hour * 3600) - (minute * 60);
		
		System.out.println(hour+"�ð� "+minute+"�� "+second+"�� ���̰� ���ϴ�.");
		
		// 0�� 0�� 0�� ������ �����ִ� ��ü ����
		LocalTime time = LocalTime.of(0, 0, 0);
		// �� ���� ���̸�ŭ �ʸ� ����
		time = time.plusSeconds(second);
		
		System.out.println(time.getHour() + "�ð� " + time.getMinute() + "�� "+ time.getSecond()+"�ʰ� ����");
		
//		LocalDate date1 = LocalDate.of(2020, 1, 19);
//		LocalDate date2 = LocalDate.now();
//		
//		Period period = Period.between(date1, date2);
//		
//		// 1�� 2���� 11��
//		// 1��
//		long year = period.get(ChronoUnit.YEARS);
//		// 2����
//		long month = period.get(ChronoUnit.MONTHS);
//		// 11��
//		long day = period.get(ChronoUnit.DAYS);
//		
//		String date1String = toString(date1);
//		String date2String = toString(date2);
//		String periodString = year + "�� " + month + "���� " + day + "�� ���̰� ���ϴ�.";
//		
//		System.out.println(date1String + "�� "+ date2String +"�� "+periodString);
//		
//		// ��¥ ���̸� �ϴ����� �����ִ� ����
//		long dayPeriod = (year * 365) + (month * 30) + day;
//		// ��¥�� ���̸� ������ ������ ���� �ִ� ����
//		long monthPeriod = (year * 12) + month;
//		
//		System.out.println(date1String + "�� "+ date2String +"�� "+dayPeriod+"�� ���̰� ���ϴ�.");
//		System.out.println(date1String + "�� "+ date2String +"�� "+monthPeriod+"���� ���̰� ���ϴ�.");
		
	}

}
