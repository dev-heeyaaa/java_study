package chapter9;

import java.io.File;

public class ex1 {

	public static void main(String[] args) {
		// 실존하는 파일을 객체로 만들어 연결하기
		File file1 = new File("C:\\Users\\ITPS\\Desktop\\test.txt");
		File file2 = new File("C:\\Users\\ITPS\\Desktop", "test.txt");
		
		
		// 디렉토리 -> 윈도우에서는 폴더라고 부름
		File directory = new File("C:\\Users\\ITPS\\Desktop");
		File file3 = new File(directory, "test.txt");
		
		
	}

}
