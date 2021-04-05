package chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		// ArrayList, LinkedList, Stack, vector ... 
		// ArrayList Ư¡ - �߰��� ����,������ ����� ��Ȳ������ �������� �ڷᱸ��
		// 				 - �� �ڿ��� ����, ������ ����� ��Ȳ������ ������ �ڷᱸ��!
		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("D");
		
		System.out.println("�ʱ� ����: "+arrayList);
		
		List<Integer> intList = new ArrayList<>();

		for (int i = 1; i <=10; i++) {
			intList.add(i);
		}
		System.out.println(intList); // ������ ����Ǿ��ִ� �� �ƴϴ�! Integer���ñ�(�ν��Ͻ��� ����Ǿ��ִ� �ſ��� �����ڽ̵Ǹ鼭Ƣ����°Ŵ�?
		int num1 = intList.get(0);
		
		
		
//		arrayList = new LinkedList<>();
//		
//		ArrayList<String> arrList = new ArrayList<>();
//		arrayList = new LinkedList<>();
		
		Passenger passenger1 = new Passenger("ȫ�浿", "010-1473-3698","���ڳ��");
		Passenger passenger2 = new Passenger("��ö��", "010-1598-7775","�۽�Ʈ");
		Passenger passenger3 = new Passenger("����", "010-0000-0000","����Ͻ�");
		Passenger passenger4 = new Passenger("�ְ�â��", "010-1234-5678","�۽�Ʈ");
		Passenger passenger5 = new Passenger("Ȳ����", "010-7418-5096","����Ͻ�");
		List<Passenger> passengerList = new ArrayList<>();
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		passengerList.add(passenger3);
		passengerList.add(passenger4);
		passengerList.add(passenger5);

		arrayList.add(1, "B");
		System.out.println("�ε��� 1 ��ġ�� B �߰�: "+arrayList);
		
		Passenger passenger0 = new Passenger("��;�", "010-9998-5096","����Ͻ�");
		
		passengerList.add(passenger0);
		
		arrayList.remove(4);
		System.out.println(arrayList);
		
		Passenger passenger = passengerList.get(2);
		System.out.println(passenger.getName());
		System.out.println(passenger.getTel());
		System.out.println(passenger.getSeat());
		
		System.out.println(passengerList.isEmpty());
		
		// �÷��� �����ӿ�ũ�� ����ִ� �������� ������ ��ȯ
		System.out.println(passengerList.size());
		
		// i�� 0���� �����ؼ� �� ������.
		// �̰� �Ӽ��� ���̰�
		for (int i = 0; i < passengerList.size(); i++) {
			System.out.println(passengerList.get(i));
		}
		
		// ���� for�� -> for each��
		for (Passenger p : passengerList) {
			System.out.println(p);
		} // end for
		
		int[] arr = {1, 2, 3, 4, 5};
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
