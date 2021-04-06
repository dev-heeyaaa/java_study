package chapter8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		// �Է½�Ʈ�� - ���α׷��� �ٱ����� ������ �����Ͱ� �̵��ϴ� ��
		// ByteArray - �޸��� �����͸� ��/����ϴµ� ����ϴ� Ŭ����
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		// ��½�Ʈ�� - ���α׷��� �ȿ��� �ٱ�����
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
//		int data = 0;
//		while((data = input.read()) != -1) {
//			output.write(data);
//		}
		// �м��� ����!
		while(true) {
			int data = input.read();
			if(data == -1) {
				break; // inSrc�� �������� �����ϸ� �������Ͷ�
			}
			output.write(data);
		}
		outSrc = output.toByteArray();
		System.out.println("Input Source : "+Arrays.toString(inSrc));
		System.out.println("Out Source : "+Arrays.toString(outSrc));
	}
		
}
