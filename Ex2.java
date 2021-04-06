package chapter9;

import java.io.File;

public class Ex2 {

	public static void main(String[] args) {
		
		//String path = "D:\\eclipse-workspace\\21-03-29\\src\\chapter8\\Ex10.java";
		File directory = new File("src\\chapter8\\");
		String fileName = "Ex11.java";
		File file = new File(directory, fileName);
		
		// String fileName = file.getName();
		int position = fileName.lastIndexOf(".");
		
		
		System.out.println("경로를 제외한 파일 이름 - "+fileName);
		// substring -> 문자열을 자른다
		System.out.println("확장자를 제외한 파일 이름 - "+fileName.substring(0, position));
		
		System.out.println("확장자 - "+ fileName.substring(position + 1));
		System.out.println();
		System.out.println("경로를 포함한 파일 이름 = "+file.getPath());
		System.out.println("파일의 절대경로-"+file.getAbsolutePath());
		System.out.println("파일이 속해있는 디렉토리 ="+file.getParent());
		System.out.println();
		
		

	}

}
