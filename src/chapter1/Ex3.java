package chapter1;
// 메서드에서 예외가 발생했을 때는?
public class Ex3 {
	static double div(int val1, int val2) {
		try {
			double result = val1 / val2;
			
			return result;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
			return 0;
		}
		
		
	}
	static int readArrayElement(int index) throws ArrayIndexOutOfBoundsException{
		// WrongIndexException 예외는 ㄴ내부에서 처리를 하고
		// ArrayIndexOutofCoundsException 예외는 메서드를 호출한 쪽에서 처리하독록
		try {
			int array[] = {9, 8, 7};
			
			if(index < 0) {
				throw new WrongIndexException("인덱스는 0 또는 양의 점수만 가능");
			}
			return array[index];
		} catch (WrongIndexException e) {
			System.out.println(e.getMessage());
			
			return 0;
		}
		
	}
	static void makeException() throws MyException{
		System.out.println("makeException 실행");
		
		throw new MyException("내가 만든 예외 발생");
		
	}
	public static void main(String[] args) {
		double result1 = div(10, 0);
		System.out.println(result1);
		try {
		int result2 = readArrayElement(3);
		System.out.println(result2);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
			makeException();
		} catch (MyException e) {
			System.out.println("makeException 메서드가 예외를 던짐");
		}
		
		
			
	}

}
