package chapter4;
// ���� �ʿ�~~~
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex9 {

	public static void main(String[] args) {
		Set<String> lylicsSet = new HashSet<String>();
		
		Scanner scanf = new Scanner(System.in);
		while(true) {
			System.out.print("�뷡 ���縦 �Է��ϼ���. (����: -1): ");
			String inp = scanf.next();
			
			if(inp.equals("-1")) break;
			
			// Set�� �ߺ� ���θ� ���� �˷���
			boolean addResult = lylicsSet.add(inp);
			
			if (!addResult) {
				System.out.println("�̹� �Էµ� �����Դϴ�. => "+inp);
			}
			
			System.out.println();
		}
		scanf.close();
	
		

	}

}
