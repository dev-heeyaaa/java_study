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
		
		float el3 = intList.get(5); //�����ڽ��� �Ǹ鼭 ����ȯ?
		String el4 = intList.get(5).toString(); // ������ �����ڽ��� �ϴ��� ��Ʈ��Ÿ���� �� �ȴ�
		//toString()�� ����ϸ� ������ ���ڿ�ȭ �Ѵ�
		System.out.println(el3);
		System.out.println(el4);
		
	}

}
