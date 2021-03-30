package chapter2;

import java.util.Calendar;

public class Ex2 {

	public static void main(String[] args) {
		// 현재의 날짜와 시간 정보를 갖고 있는 인스턴스
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("올 해: "+calendar.get(Calendar.YEAR));
		// Calendar 클래스는 0~11월 존재. 0월부터 센다잇
		System.out.println("이번 달: "+(calendar.get(Calendar.MONTH)+ 1));
		System.out.println("오늘의 이번 달 주차: "+calendar.get(Calendar.WEEK_OF_MONTH));
		
		// 이번 달의 오늘의 날짜
		System.out.println("오늘의 날짜: "+calendar.get(Calendar.DAY_OF_MONTH));
		// 올해의 오늘의 날짜 (1월 1일 기준)
		System.out.println("오늘의 날짜: "+calendar.get(Calendar.DAY_OF_YEAR));
		
		String[] days = {"","일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘의 요일: "+days[calendar.get(Calendar.DAY_OF_WEEK)]+"요일");
		
		
		System.out.println("시: "+calendar.get(Calendar.HOUR));
		System.out.println("분: "+calendar.get(Calendar.MINUTE));
		System.out.println("초: "+calendar.get(Calendar.SECOND));
		
		System.out.println("이 달의 마지막 날: "+calendar.getActualMaximum(Calendar.DATE));
		
		
	}

}
