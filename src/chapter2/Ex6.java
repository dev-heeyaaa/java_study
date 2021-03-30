package chapter2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex6 {

	public static void main(String[] args) {
		// ��¥ ����ȭ - SimpleDataFormat
		Calendar calendar = Calendar.getInstance();
		
		Date date = calendar.getTime();
		
		SimpleDateFormat sdf;
		
		// y -> ��, M -> ��, d -> ��
		// yyyy -> ���� ����ϴµ� 4�ڸ��� ����ض�
		// MM -> ���� ����ϴµ� 2�ڸ� ���� ����ض�
		// dd -> ���� ����ϴµ� 2�ڸ� �Ϸ� ����ض�
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(sdf.format(date));
		
		// toString �޼��� ����� �ͺ��� �������� ���Ƽ�
		// ��¥ ����� �� ���� ���� ��¥����ȭ!
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");		
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy�� M�� d�� H:m:ss");		
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy�� M�� d�� H:m:s.SSS");		
		System.out.println(sdf.format(date));
		
		// H�� 13�� h�� 1��
		sdf = new SimpleDateFormat("yy�� M�� d�� h:m:s.SSS");		
		System.out.println(sdf.format(date));
		
		// a�� �������� ��������
		sdf = new SimpleDateFormat("yy�� M�� d�� h:m:s.SSS a");		
		System.out.println(sdf.format(date));

	}

}
