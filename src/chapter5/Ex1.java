package chapter5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex1 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		//set은 get 메서드가 존재하지 않음
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// foreach
		// 향상된 for문
		// 자바 문법은 아님 다른 언어에서 나온 문법인데 거기서 foreach라고 불러서 부른다나뭐라나ㅏ응응
		for (Integer i : set) {
			System.out.print(i+ " ");
		}
		
		// key를 모르는 경우? ex) 네트워크로부터 맵을 전달 받았다? 맵은 존재하지만 맵 안에 들어있는 key는 잘 모를 때 -> KeySet 사용해서 핸들링
		
		
	}

}
