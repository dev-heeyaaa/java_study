package chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		// ArrayList, LinkedList, Stack, vector ... 
		// ArrayList 특징 - 중간에 삽입,삭제가 빈번한 상황에서는 부적합한 자료구조
		// 				 - 맨 뒤에서 삽입, 삭제가 빈번한 상황에서는 적합한 자료구조!
		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("D");
		
		System.out.println("초기 상태: "+arrayList);
		
		List<Integer> intList = new ArrayList<>();

		for (int i = 1; i <=10; i++) {
			intList.add(i);
		}
		System.out.println(intList); // 정수가 저장되어있는 게 아니다! Integer뭐시기(인스턴스가 저장되어있는 거여서 오토언박싱되면서튀어나오는거다?
		int num1 = intList.get(0);
		
		
		
//		arrayList = new LinkedList<>();
//		
//		ArrayList<String> arrList = new ArrayList<>();
//		arrayList = new LinkedList<>();
		
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

		arrayList.add(1, "B");
		System.out.println("인덱스 1 위치에 B 추가: "+arrayList);
		
		Passenger passenger0 = new Passenger("우와악", "010-9998-5096","비즈니스");
		
		passengerList.add(passenger0);
		
		arrayList.remove(4);
		System.out.println(arrayList);
		
		
	}

}
