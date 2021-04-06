package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		Set<Passenger> passengerList = new HashSet<Passenger>();
		
		Passenger passenger1 = new Passenger("홍길동", "010-1473-3698", "이코노미");
		Passenger passenger2 = new Passenger("홍길동", "010-1473-3698", "이코노미");
		
		passenger1.equals(passenger2.hashCode());
		// add를 하면은 기존에 들어있는 데이터들의 equals 메서드 호출하는 데 매개변수는 추가하려는 데이터의 해시값으로 전달
		
		
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		
		System.out.println(passengerList);
		
		passengerList.remove(passenger1);
		System.out.println(passengerList);
		
		Iterator<Passenger> iterator = passengerList.iterator();		
		
		
	}

}
