package chapter2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex7 {

	public static void main(String[] args) {
		// time ��Ű��
		
		// ��ü�� Ÿ�Կ� Date �ܾ �����Ƿ� ��¥�� �ٷ��
		LocalDate localDate = LocalDate.now();
		
		// ��ü Ÿ�Կ� Time �ܾ �����Ƿ� �ð��� �ٷ��.
		LocalTime localTime = LocalTime.now();
		
		// ��ü Ÿ�Կ� Date, Time �ܾ ��� �����Ƿ� ��¥�� �ð��� �ٷ��
		LocalDateTime localDateTime = LocalDateTime.now();
		
		// Zone -> �ð���, Date -> ��¥, Time -> �ð� / �ð������ �����ִ� ��¥�� �ð��� �ٷ��
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		System.out.println("===== =====");
		
		//2021-03-25 ��¥�� �����ִ� ��ü
		LocalDate ld = LocalDate.of(2021, 03, 25);
		//1:12:34 �ð��� �����ִ� ��ü
		LocalTime lt = LocalTime.of(1, 12, 34);
		//2021-03-25 1:12;34 ��¥�� �ð��� �����ִ� ��ü
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		// ��¥, �ð�, �ð������ �����ִ� ��ü 
		ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
		
		
		
		

	}

}
