package chapter4;

public class Ex6 {

	public static void main(String[] args) {
		Passenger p1 = new Passenger("ȫ�浿", "010-7591-8524", "���ڳ��");
		Passenger p2 = new Passenger("ȫ�浿", "010-7591-8524", "���ڳ��");
		
		// �� �ν��Ͻ� �̸��� ����
		String p1Name = p1.getName();
		String p2Name = p2.getName();
		
		boolean nameSame = p1Name.equals(p2Name);
		
		// �� �ν��Ͻ� ������ ����
		String p1Tel = p1.getTel();
		String p2Tel = p2.getTel();
		
		boolean telSame = p1Tel.equals(p2Tel);
		
		// �� �ν��Ͻ� �¼��� ����
		String p1Seat = p1.getSeat();
		String p2Seat = p2.getSeat();
		
		boolean seatSame = p1Seat.equals(p2Seat);
		
		
		// �̸� ���� �ּ� ��� ���ٸ� true �ƴϸ� false
		if(nameSame && telSame && seatSame) {
			System.out.println("p1�� p2�� �����ϴ�");
		}else {
			System.out.println("p1�� p2�� �ٸ��ϴ�");
		}

	}

}
