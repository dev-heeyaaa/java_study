package chapter4;
// 복습 필요~~~
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex9 {

	public static void main(String[] args) {
		Set<String> lylicsSet = new HashSet<String>();
		
		Scanner scanf = new Scanner(System.in);
		while(true) {
			System.out.print("노래 가사를 입력하세요. (종료: -1): ");
			String inp = scanf.next();
			
			if(inp.equals("-1")) break;
			
			// Set이 중복 여부를 쉽게 알려줌
			boolean addResult = lylicsSet.add(inp);
			
			if (!addResult) {
				System.out.println("이미 입력된 가사입니다. => "+inp);
			}
			
			System.out.println();
		}
		scanf.close();
	
		

	}

}
