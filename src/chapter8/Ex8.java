package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex8 {

	public static void main(String[] args) {
		FileInputStream fis = null;	// �Է½�Ʈ��
		FileReader fr = null;		// �Է½�Ʈ��
		// fis, fr - �Է� ��Ʈ��
		// fis - ����Ʈ ��� �Է� ��Ʈ��
		// fr - ���� ��� �Է� ��Ʈ��
		
		String fileName = "C:\\Users\\ITPS\\Desktop\\test.txt";
		try {
			fis = new FileInputStream(fileName);
			fr = new FileReader(fileName);
			
			while(true) {
				int data = fis.read();
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}
			System.out.println();
			while(true) {
				int data = fr.read();
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}// end try
		}// end try
	
		
		
	}

}
