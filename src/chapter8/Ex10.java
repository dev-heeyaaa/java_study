package chapter8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex10 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("Ex10.java");
			br = new BufferedReader(fr);
			
			String line = "";
			for (int i = 1; line != null; i++) {
				line = br.readLine(); // 보조 스트림이 제공하는 readLine 메서드. \n을 만나기 전까지 만나는 데이터를 한 줄에 다 담아서 가져온다
				
				System.out.println(i + ":" + line); // 줄 수: 줄 내용 형식으로 출력
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}

}
