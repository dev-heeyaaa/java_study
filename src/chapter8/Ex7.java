package chapter8;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex7 {

	public static void main(String[] args) {
		// byte ��� ���� ��Ʈ��
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			// ��� ��Ʈ��
			fos = new FileOutputStream("C:\\Users\\ITPS\\Desktop\\bos.txt");
			
			// ��� ��Ʈ���� ���� ��Ʈ���� ����
			// ������ �⺻ ������� 8KB
			bos = new BufferedOutputStream(fos, 5);
			// ���۰� �� ���� txt ���Ϸ� �̵��Ѵ�. ���� ����� 5�ϱ� 1, 2, 3, 4, 5���� ����Ǹ� bos.txt ���Ϸ� ��µǰ�
			// �������� 6, 7, 8, 9,�� 5 ����� �� �ǹǷ� ���������� close�� �����ϱ� ����� �� �Ǿ��� ��!
			for(char i = '1'; i <= '9'; i++) { // ���� ����� 5�� 5������ ����� �Ƴ�?
				bos.write(i);
			} bos.flush(); // flush�� �ϸ� ���������� 123456789���� ����� �ȴ�.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				// ������Ʈ���� ������
				// ������Ʈ���� ����� ��ݽ�Ʈ���� �ڵ����� ������.
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
