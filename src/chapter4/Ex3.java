package chapter4;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			intList.add(i);
		}
		System.out.println(intList.get(2));
		
		Integer el1 = intList.get(5);
		System.out.println(el1);
		
		Integer el2 = intList.get(5);
		System.out.println(el2);
		
		float el3 = intList.get(5); //오토언박싱이 되면서 형변환?
		String el4 = intList.get(5).toString(); // 정수를 오토언박싱을 하더라도 스트링타입은 안 된다
		//toString()을 사용하면 정수를 문자열화 한다
		System.out.println(el3);
		System.out.println(el4);
		
	}

}
