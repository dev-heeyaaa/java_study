package chapter8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		// 입력스트림 - 프로그램의 바깥에서 안으로 데이터가 이동하는 것
		// ByteArray - 메모리의 데이터를 입/출력하는데 사용하는 클래스
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		// 출력스트림 - 프로그램의 안에서 바깥으로
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
//		int data = 0;
//		while((data = input.read()) != -1) {
//			output.write(data);
//		}
		// 분석해 보기!
		while(true) {
			int data = input.read();
			if(data == -1) {
				break; // inSrc에 마지막에 도달하면 빠져나와라
			}
			output.write(data);
		}
		outSrc = output.toByteArray();
		System.out.println("Input Source : "+Arrays.toString(inSrc));
		System.out.println("Out Source : "+Arrays.toString(outSrc));
	}
		
}
