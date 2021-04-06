package chapter4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex5 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Passenger passenger1 = new Passenger("홍길동", "010-1473-3698","이코노미");
		Passenger passenger2 = new Passenger("김철수", "010-1598-7775","퍼스트");
		Passenger passenger3 = new Passenger("고영희", "010-0000-0000","비즈니스");
		Passenger passenger4 = new Passenger("최강창민", "010-1234-5678","퍼스트");
		Passenger passenger5 = new Passenger("황광희", "010-7418-5096","비즈니스");
		List<Passenger> passengerList = new ArrayList<>();
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		passengerList.add(passenger3);
		passengerList.add(passenger4);
		passengerList.add(passenger5);
		
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		
//		Iterator<Integer> it = list.iterator();
//		
//		while(it.hasNext()) {
//			int num = it.next(); // 들고 있는 건 정수가 절대 아니다! 오토언박싱되면서 정수 
//			Integer num2 = it.next(); // Integer와 관련된 기능들을 갖고 있는 거다?
//			
//			System.out.println();
//			
//		}
		
		Iterator<Passenger> passenIterator = passengerList.iterator();
		while(passenIterator.hasNext()) {
			Passenger p1 = passenIterator.next();
			System.out.println(p1.getName());
			System.out.println(p1.getTel());
			System.out.println(p1.getSeat());
		}
		
	}

}
