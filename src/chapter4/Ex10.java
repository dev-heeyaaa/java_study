package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		Set<Passenger> passengerList = new HashSet<Passenger>();
		
		Passenger passenger1 = new Passenger("ȫ�浿", "010-1473-3698", "���ڳ��");
		Passenger passenger2 = new Passenger("ȫ�浿", "010-1473-3698", "���ڳ��");
		
		passenger1.equals(passenger2.hashCode());
		// add�� �ϸ��� ������ ����ִ� �����͵��� equals �޼��� ȣ���ϴ� �� �Ű������� �߰��Ϸ��� �������� �ؽð����� ����
		
		
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		
		System.out.println(passengerList);
		
		passengerList.remove(passenger1);
		System.out.println(passengerList);
		
		Iterator<Passenger> iterator = passengerList.iterator();		
		
		
	}

}
