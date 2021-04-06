package chapter4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex5 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
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
		
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		
//		Iterator<Integer> it = list.iterator();
//		
//		while(it.hasNext()) {
//			int num = it.next(); // ��� �ִ� �� ������ ���� �ƴϴ�! �����ڽ̵Ǹ鼭 ���� 
//			Integer num2 = it.next(); // Integer�� ���õ� ��ɵ��� ���� �ִ� �Ŵ�?
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
