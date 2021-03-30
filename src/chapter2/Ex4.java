package chapter2;

import java.util.Calendar;

public class Ex4 {
	// Ķ���� ��ü�� �����ִ� ��¥ ������
	// �츮�� ���ϴ� �������� ��ȯ�� �ִ� �޼���
	// �̸��� ���� �ٸ�
	public static String toString(Calendar calendar) {
		// �츮�� ���ϴ� ����: ��-��-��
		//yyyy-mm-dd
		
		String year = calendar.get(Calendar.YEAR)+"-";
		int monthOfYear = calendar.get(Calendar.MONTH)+1;
		// ���ڸ��� ���� ��쿡 �� �տ� 0�� ���̴� ����
		String month = (monthOfYear < 10 ? "0":"") + monthOfYear +"-";
		
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		String day = (dayOfMonth < 10 ? "0":"") + dayOfMonth;
		
		return year + month + day;
		
	}

	public static void main(String[] args) {
		
		Simple simple = new Simple();
		System.out.println(simple.toString());
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(toString(calendar));
		System.out.println("= 1�� �� =");
		
		calendar.add(Calendar.DATE, 1);
		System.out.println(toString(calendar));
		
		System.out.println("= 2�� �� =");
		calendar.add(Calendar.DATE, 2);
		System.out.println(toString(calendar));
		
		System.out.println("= 30�� �� ="); 
		calendar.add(Calendar.DATE, 30);
		System.out.println(toString(calendar));
		
		System.out.println("= �� �� �� =");
		calendar.add(Calendar.MONTH, 1);
		System.out.println(toString(calendar));
	}

}
