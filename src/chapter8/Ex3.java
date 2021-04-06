package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) {
		// ���ڸ� ���ڿ��� ������ �ָ� ���ڷ� ���޹��� ��ο� �ִ� ���ϰ� ��Ʈ���� ����
		// ������ : �ֻ��� ��θ� ������ ������ ��ġ / �ֻ��� ��κ��� �ش� ��ġ���� ������ ã��
		// ����� : �ֻ��� ��θ� ���U�� ������ ��ġ / ���� ���α׷��� ����Ǵ� ��ġ���� �ش� ��ġ���� ������ ã��
		FileInputStream fis = null;
		try {
			String path = "D:\\eclipse-workspace\\21-03-29\\src\\chapter8\\Ex3.java";
			// byte ���
			fis = new FileInputStream(path);
			
			while(true) {

				int data = fis.read();
				
				if(data == -1) {
					break; 
				}
				
				char c = (char) data;
				System.out.print(c);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} catch (IOException e) {
			System.out.println("��Ʈ���� �ݴ� ���� ������ �߻��߽��ϴ�.");
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
