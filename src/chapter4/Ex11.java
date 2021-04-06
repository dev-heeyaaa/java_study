package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11 {

	public static void main(String[] args) {
		Set<Passenger> passengerList = new HashSet<Passenger>();
		
		Passenger p1 = new Passenger("홍길동", "010-1473-3698","이코노미");
		Passenger p2 = new Passenger("김철수", "010-1598-7775","퍼스트");
		Passenger p3 = new Passenger("고영희", "010-0000-0000","비즈니스");
		Passenger p4 = new Passenger("최강창민", "010-1234-5678","퍼스트");
		Passenger p5 = new Passenger("황광희", "010-7418-5096","이코노미");
		
		passengerList.add(p1);
		passengerList.add(p2);
		passengerList.add(p3);
		passengerList.add(p4);
		passengerList.add(p5);
		
		// Iterator를 사용해서 모든 승객의 정보를 출력하세요.
		
		Iterator<Passenger> it = passengerList.iterator();
		
		// hasNext()로 다음으로 넘어갈 수 있는지 확인하고!
		while(it.hasNext()) {
			Passenger el = it.next();
			System.out.println("이름: "+el.getName());
			System.out.println("연락처: "+el.getTel());
			System.out.println("좌석: "+el.getSeat());
		}
	}

}
