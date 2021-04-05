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
		
		Passenger passenger = passengerList.get(2);
		System.out.println(passenger.getName());
		System.out.println(passenger.getTel());
		System.out.println(passenger.getSeat());
		
		System.out.println(passengerList.isEmpty());
		
		// 컬렉션 프레임워크에 들어있는 데이터의 개수를 반환
		System.out.println(passengerList.size());
		
		// i가 0으로 시작해서 로 끝난다.
		// 이게 머서ㄴ 말이고
		for (int i = 0; i < passengerList.size(); i++) {
			System.out.println(passengerList.get(i));
		}
		
		// 향상된 for문 -> for each문
		for (Passenger p : passengerList) {
			System.out.println(p);
		} // end for
		
		int[] arr = {1, 2, 3, 4, 5};
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
