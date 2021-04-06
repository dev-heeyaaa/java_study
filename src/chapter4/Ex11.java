package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11 {

	public static void main(String[] args) {
		Set<Passenger> passengerList = new HashSet<Passenger>();
		
		Passenger p1 = new Passenger("ȫ�浿", "010-1473-3698","���ڳ��");
		Passenger p2 = new Passenger("��ö��", "010-1598-7775","�۽�Ʈ");
		Passenger p3 = new Passenger("����", "010-0000-0000","����Ͻ�");
		Passenger p4 = new Passenger("�ְ�â��", "010-1234-5678","�۽�Ʈ");
		Passenger p5 = new Passenger("Ȳ����", "010-7418-5096","���ڳ��");
		
		passengerList.add(p1);
		passengerList.add(p2);
		passengerList.add(p3);
		passengerList.add(p4);
		passengerList.add(p5);
		
		// Iterator�� ����ؼ� ��� �°��� ������ ����ϼ���.
		
		Iterator<Passenger> it = passengerList.iterator();
		
		// hasNext()�� �������� �Ѿ �� �ִ��� Ȯ���ϰ�!
		while(it.hasNext()) {
			Passenger el = it.next();
			System.out.println("�̸�: "+el.getName());
			System.out.println("����ó: "+el.getTel());
			System.out.println("�¼�: "+el.getSeat());
		}
	}

}
