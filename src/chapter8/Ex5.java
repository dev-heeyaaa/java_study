package chapter8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {

	public static void main(String[] args) {
		FileOutputStream fos = null;


		String path = "C:\\Users\\ITPS\\Desktop\\output.txt";
		try {
			
			fos = new FileOutputStream(path);
			
//			byte[] datas = "a, b, c, d, e, f, g, h, i, z, k, l, m ,n ,o, p, q, r, s, t, u, v, w, y, z".getBytes();
			for(byte i = 'A'; i<='Z';i++) {
				fos.write(i);
				fos.write(' ');
			}
			
//			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
