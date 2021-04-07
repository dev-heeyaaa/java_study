package chapter9;

import java.io.File;
import java.util.Scanner;

public class Ex8 {
	public static final char sortOptionList[] = {'t', 'T', 'l', 'L', 'n', 'N'};
	
	public static boolean isOrtOprion(char sortOption){
		for (char option : sortOptionList) {
			if(option == sortOption) {
				return true;
			}// end if
		}// end for
		
		return false;
	}
	
	public static void sortFileList(File [] files, char option) {
		if(option == 't') {
			// 시간 오름차순
			for(int i = 0; i<files.length; i++) {
				for(int j = files.length-1; j>i; j--) {
					File forward = files[j-1];
					File backward = files[j];
					
					long forwardLastModified = forward.lastModified();
					long backwardLastModified = backward.lastModified();
					
					if(forwardLastModified > backwardLastModified) {
						File temp = files[j-1];
						files[j-1] = files[j];
						files[j] =temp;
					}
					
				} // end for j
			}// end for i
		}// end if
	}
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("======= [ 사용법 ] =======");
		
		System.out.println("경로: (디렉토리 또느 파일의 경로 입력: ");
		System.out.println("정렬: (정렬 단어");
		System.out.println("L t : 시간 오름차순 정렬");
		System.out.println("L T : 시간 내림차순 정렬");
		System.out.println("L l : 크기 오름차순 정렬");
		System.out.println("L L : 크기 내림차순 정렬");
		System.out.println("L n : 이름 오름차순 정렬");
		System.out.println("L M : 이름 내림차순 정렬");
		System.out.println("프로그램을 정료하려면 경로레 exit을ㄹ 입력하세요.");
		
		while(true) {
			System.out.println("경로 : ");
			String path = scanf.next();
			
			System.out.println("정렬 : ");
			char sort = scanf.next().charAt(0);
			if(path.equals("exit"){
				System.out.println("프로그램 종료");
				break;
			}
			File file = new File(path);
			File[] files = file.listFiles();
			
			
			
		}
	}

}
