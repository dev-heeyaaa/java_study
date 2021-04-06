package chapter8;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex7 {

	public static void main(String[] args) {
		// byte 기반 보조 스트림
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			// 기반 스트림
			fos = new FileOutputStream("C:\\Users\\ITPS\\Desktop\\bos.txt");
			
			// 기반 스트림에 보조 스트림을 부착
			// 버퍼의 기본 사이즈는 8KB
			bos = new BufferedOutputStream(fos, 5);
			// 버퍼가 꽉 차야 txt 파일로 이동한다. 버퍼 사이즈가 5니까 1, 2, 3, 4, 5까지 저장되면 bos.txt 파일로 출력되고
			// 다음으로 6, 7, 8, 9,는 5 사이즈가 안 되므로 빠져나오고 close가 나오니까 출력이 안 되었던 것!
			for(char i = '1'; i <= '9'; i++) { // 버퍼 사이즈가 5라서 5까지만 출력이 됐나?
				bos.write(i);
			} bos.flush(); // flush를 하면 정상적으로 123456789까지 출력이 된다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				// 보조스트림을 닫으면
				// 보조스트림과 연결된 기반스트림도 자동으로 닫힌다.
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
