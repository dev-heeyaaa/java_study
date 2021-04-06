package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// 원본 파일
		String srcPath = "D:\\eclipse-workspace\\21-03-29\\src\\chapter8\\Ex4.java";
		// 복사 파일
		String copyPath = "D:\\eclipse-workspace\\21-03-29\\src\\chapter8\\Ex4.bak";
		
	
		try {
			
			fis = new FileInputStream(srcPath);			
			fos = new FileOutputStream(copyPath);
			
			while(true) {
				int data = fis.read();
				if(data == -1) {
					break;
				}
				fos.write(data);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} catch (IOException e) {
			System.out.println("문제가 발생했습니다.");
		}finally {
			try {
				fos.close(); // try catch 각각 해 줘서 두 스트림 모두 확실히 닫히도록 해 준다
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
