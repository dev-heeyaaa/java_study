package chapter2;

import java.util.Calendar;

public class Ex3 {
	static final int DAY_IN_SECOND = 24 * 60 * 60;
	static final int HOUR_IN_SECOND = 60 * 60;
	static final int MINUTE_IN_SECOND = 60;
	
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();// 코드가 쳐지는 현재 시점?
		Calendar cal2 = Calendar.getInstance();
		
		// Calendar는 월을 0부터 카운팅 함
		cal1.set(2021, Calendar.JANUARY, 1);// 개발자가 원하는 날짜로 
		cal2.set(2021, Calendar.JANUARY, 2);
		
		long cal1ToSecond = cal1.getTimeInMillis();
		long cal2ToSecond = cal2.getTimeInMillis();
		
		long difference = cal2ToSecond - cal1ToSecond;
		difference = difference / 1000; // 초 단위??
		
		
		System.out.println(difference+"초가 흘렀습니다");
		// 초 단위를 일 단위로 환산
		int period = (int) (difference / Ex3.DAY_IN_SECOND);		
		int period2 = (int) (difference / Ex3.HOUR_IN_SECOND);
		int period3 = (int)(difference / Ex3.MINUTE_IN_SECOND);
		System.out.println(period + "일 경과");
		System.out.println(period2+"시간 경과");
		System.out.println(period3+"분 경과");
		
		

	}

}
