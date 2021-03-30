package chapter2;

import java.util.Calendar;

public class Ex2 {

	public static void main(String[] args) {
		// ������ ��¥�� �ð� ������ ���� �ִ� �ν��Ͻ�
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("�� ��: "+calendar.get(Calendar.YEAR));
		// Calendar Ŭ������ 0~11�� ����. 0������ ������
		System.out.println("�̹� ��: "+(calendar.get(Calendar.MONTH)+ 1));
		System.out.println("������ �̹� �� ����: "+calendar.get(Calendar.WEEK_OF_MONTH));
		
		// �̹� ���� ������ ��¥
		System.out.println("������ ��¥: "+calendar.get(Calendar.DAY_OF_MONTH));
		// ������ ������ ��¥ (1�� 1�� ����)
		System.out.println("������ ��¥: "+calendar.get(Calendar.DAY_OF_YEAR));
		
		String[] days = {"","��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.println("������ ����: "+days[calendar.get(Calendar.DAY_OF_WEEK)]+"����");
		
		
		System.out.println("��: "+calendar.get(Calendar.HOUR));
		System.out.println("��: "+calendar.get(Calendar.MINUTE));
		System.out.println("��: "+calendar.get(Calendar.SECOND));
		
		System.out.println("�� ���� ������ ��: "+calendar.getActualMaximum(Calendar.DATE));
		
		
	}

}
