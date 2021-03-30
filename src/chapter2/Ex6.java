package chapter2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex6 {

	public static void main(String[] args) {
		// 날짜 형식화 - SimpleDataFormat
		Calendar calendar = Calendar.getInstance();
		
		Date date = calendar.getTime();
		
		SimpleDateFormat sdf;
		
		// y -> 년, M -> 월, d -> 일
		// yyyy -> 년을 출력하는데 4자리로 출력해라
		// MM -> 월을 출력하는데 2자리 월로 출력해라
		// dd -> 일을 출력하는데 2자리 일로 출력해라
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(sdf.format(date));
		
		// toString 메서드 만드는 것보다 가독성이 좋아서
		// 날짜 사용할 때 많이 쓰는 날짜형식화!
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");		
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy년 M월 d일 H:m:ss");		
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy년 M월 d일 H:m:s.SSS");		
		System.out.println(sdf.format(date));
		
		// H는 13시 h는 1시
		sdf = new SimpleDateFormat("yy년 M월 d일 h:m:s.SSS");		
		System.out.println(sdf.format(date));
		
		// a는 오전인지 오후인지
		sdf = new SimpleDateFormat("yy년 M월 d일 h:m:s.SSS a");		
		System.out.println(sdf.format(date));

	}

}
