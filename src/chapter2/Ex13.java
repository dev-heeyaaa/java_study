package chapter2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Ex13 {
	public static String toString(LocalDate date) {
		String year = date.getYear() + "년";
		String month = date.getMonthValue() + "월";
		String day = date.getDayOfMonth()+ "일";
		
		return year + " " + month + " " + day;
	}
	public static void main(String[] args) {
		LocalTime time1 = LocalTime.of(0, 0, 0);
		LocalTime time2 = LocalTime.of(9, 12, 34);
		
		// 초 단위 차이만 알 수 있음!
		Duration duration = Duration.between(time1, time2);
		
		//초 단위 차이
		long second = duration.get(ChronoUnit.SECONDS);
		
		// 나노초 단위 차이/ 밀리초(1/1000), 마이크로초(1/1000000), 나노초(1/1000000000) 순서로 작아짐
		long nano = duration.get(ChronoUnit.NANOS);
		
		
		System.out.println(second);
		System.out.println(nano);
		// <내가 한 것>
//		long time = second / 3600;
//		long minute = (second % 3600) / 60;
//		long second2 = (second % 3600) % 60;
		
//		System.out.println(time+"시간 "+minute+"분 "+second2+"초 차이가 납니다.");
		
		// <강사님 답>
		long hour = second / 3600;
		long minute = (second - (hour * 3600)) / 60;
		second = second - (hour * 3600) - (minute * 60);
		
		System.out.println(hour+"시간 "+minute+"분 "+second+"초 차이가 납니다.");
		
		// 0시 0분 0초 정보를 갖고있는 객체 생성
		LocalTime time = LocalTime.of(0, 0, 0);
		// 초 단위 차이만큼 초를 더함
		time = time.plusSeconds(second);
		
		System.out.println(time.getHour() + "시간 " + time.getMinute() + "분 "+ time.getSecond()+"초가 차이");
		
//		LocalDate date1 = LocalDate.of(2020, 1, 19);
//		LocalDate date2 = LocalDate.now();
//		
//		Period period = Period.between(date1, date2);
//		
//		// 1년 2개월 11일
//		// 1년
//		long year = period.get(ChronoUnit.YEARS);
//		// 2개월
//		long month = period.get(ChronoUnit.MONTHS);
//		// 11일
//		long day = period.get(ChronoUnit.DAYS);
//		
//		String date1String = toString(date1);
//		String date2String = toString(date2);
//		String periodString = year + "년 " + month + "개월 " + day + "일 차이가 납니다.";
//		
//		System.out.println(date1String + "은 "+ date2String +"과 "+periodString);
//		
//		// 날짜 차이를 일단위로 갖고있는 변수
//		long dayPeriod = (year * 365) + (month * 30) + day;
//		// 날짜의 차이를 개월수 단위로 갖고 있는 변수
//		long monthPeriod = (year * 12) + month;
//		
//		System.out.println(date1String + "은 "+ date2String +"과 "+dayPeriod+"일 차이가 납니다.");
//		System.out.println(date1String + "은 "+ date2String +"과 "+monthPeriod+"개월 차이가 납니다.");
		
	}

}
