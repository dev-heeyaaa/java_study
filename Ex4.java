package chapter9;

import java.io.File;

public class Ex4 {

	public static void main(String[] args) {
		File file = new File("src\\test\\");
		
		if(!file.exists() || !file.isDirectory()) {
			System.out.println("존재하지 않거나 디렉토리가 아닙니다.");
			System.out.println("해당 경로에 디렉토리를 생성합니다.");
			
			file.mkdir(); // mkdir()-> make directory: 우리가 지정한 마지막 디렉토리만 생성하는 메서드
			file.mkdirs(); // 지정한 경로 내 존재하지 않는 디렉토리까지 다 생성을 해 주는 메서드
		}else {
			System.out.println("존재합니다.");
		}

	}

}
