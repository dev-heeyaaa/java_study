package chapter2;

import java.util.Calendar;

public class Ex3 {
	static final int DAY_IN_SECOND = 24 * 60 * 60;
	static final int HOUR_IN_SECOND = 60 * 60;
	static final int MINUTE_IN_SECOND = 60;
	
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();// �ڵ尡 ������ ���� ����?
		Calendar cal2 = Calendar.getInstance();
		
		// Calendar�� ���� 0���� ī���� ��
		cal1.set(2021, Calendar.JANUARY, 1);// �����ڰ� ���ϴ� ��¥�� 
		cal2.set(2021, Calendar.JANUARY, 2);
		
		long cal1ToSecond = cal1.getTimeInMillis();
		long cal2ToSecond = cal2.getTimeInMillis();
		
		long difference = cal2ToSecond - cal1ToSecond;
		difference = difference / 1000; // �� ����??
		
		
		System.out.println(difference+"�ʰ� �귶���ϴ�");
		// �� ������ �� ������ ȯ��
		int period = (int) (difference / Ex3.DAY_IN_SECOND);		
		int period2 = (int) (difference / Ex3.HOUR_IN_SECOND);
		int period3 = (int)(difference / Ex3.MINUTE_IN_SECOND);
		System.out.println(period + "�� ���");
		System.out.println(period2+"�ð� ���");
		System.out.println(period3+"�� ���");
		
		

	}

}
