package chapter2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ex12 {

	public static void main(String[] args) {
		LocalTime time1 = LocalTime.of(0, 0, 0);
		LocalTime time2 = LocalTime.of(9, 12, 34);
		
		Duration duration = Duration.between(time1, time2);
		System.out.println(duration);
		
		// Period : 날짜 - 날짜 , Duration : 시간 - 시간
//		LocalDate date1 = LocalDate.of(2020, 1, 19);
//		LocalDate date2 = LocalDate.now();
//		
//		Period period = Period.between(date1, date2);
//		System.out.println(period); //1년 2개월 11일 후 (지났다!)
//		
//		period = Period.between(date2, date1); //음수로 출력
//		System.out.println(period); // 1년 2개월 11일 전

	}

}
