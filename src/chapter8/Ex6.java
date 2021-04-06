package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex6 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		String path = "C:\\Users\\ITPS\\Desktop\\output.txt";;
		
		try {
			fis = new FileInputStream(path);
			while(true) {
				int data = fis.read();
				if(data == -1) {
					break;
				}
				
			System.out.print((char) data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
