package chapter4;

public class Ex7 {

	public static void main(String[] args) {
		Passenger p1 = new Passenger("ȫ�浿", "010-7591-8524", "���ڳ��");
		Passenger p2 = new Passenger("ȫ�浿", "010-7591-8524", "���ڳ��");
		
		
		// ���� Object.class�� ����� hashCode�� �ν��Ͻ��� �޸� �ּҸ� �ؽ�ȭ �ϴ� ��!
		// �׷���! �޸� �ּ��� �ؽ�ȭ�� �ƴ϶� ������ �ִ� ���� �ؽ�ȭ �ϵ��� �������̵� �� ��� �ϴ� ��!
		// �׷�! ���� Passenger Ŭ������ ���� �������̵� ����~
		boolean same = p1.hashCode() == p2.hashCode();
		
		if(same) {
			System.out.println("p1�� p2�� �����ϴ�");
		}else {
			System.out.println("p1�� p2�� �ٸ��ϴ�"); 
		}

	}

}
