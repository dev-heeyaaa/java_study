package chapter3;

public class Ex3 {

	public static void main(String[] args) {
		
		Integer intValue = Integer.valueOf(10);
		System.out.println(intValue.intValue());
		
		// 오토박싱
		Integer intValue1 = 10;
		
		Double doubleValue = 3.14;
		
		Character charValue = 'a';
		
		System.out.println(intValue);
		System.out.println(doubleValue);
		System.out.println(charValue);
	
//		String str1 = new String("안녕하세요");
		String str = "안녕하세요";
		System.out.println(str);
		
		// 오토언박싱
		int num1 = intValue;
		System.out.println(num1);
		
	}

}
