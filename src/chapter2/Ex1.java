package chapter2;

import java.util.Calendar;
import java.util.Date;

public class Ex1 {

	public static void main(String[] args) {
		// 자바1 버전에서 사용했던 날짜와 시간을 핸들링하는 클래스
		Date date = new Date();
		
		// 자바 1.1 버전에서 추가된 날짜와 시간을 핸들링하는 클래스
		// Calendar 클래스는 추상클래스이므로 인스턴스를 만들 수 없음
		// 대신 Calendar 클래스에 있는 static 메서드인 getInstance()를 사용해서
		// Calendar클래스의 자식 클래스 인스턴스는 만들 수 있음
		// 프로그램이 구동되는 시스템의 국가와 지역설정을 확인해서
		// 해당 시스템에 맞는 날짜를 핸들링 할 수 있는 클래스의 인스턴스가 반환된다.
		
		Calendar calendar = Calendar.getInstance();
		
	}

}
