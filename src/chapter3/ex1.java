package chapter3;
//제네릭스 (Generics)
public class ex1 {

	public static void main(String[] args) {
		ClassName<Object> object1 = new ClassName<>();// 이렇게 생략도 가능
		ClassName<String> object2 = new ClassName<>();
		
		
		ClassName<Integer> object3 = new ClassName<Integer>();
		ClassName<Double> object4 = new ClassName<Double>();
		
//		Person<String> p1 = new Person<String>();
//		Person<String> p2  = new Person<>();

		
		// 제네릭 타입 자리에는 기본 데이터 타입은 들어갈 수 없다
		// 제네릭 타입 자리에는 클래스만 올 수가 있다
		// 기본 데이터 타입을 클래스로 만들어두었다.
		// 정수, 실수, 문자를 제네릭 타입 자리에 쓰려면
		// 기본 데이터 타입을 클래스로 만들어둔 클래스를 사용해야 한다.
		Person<Integer> p3 = new Person<>(1012345678);
		
		Person<String, Integer> p4 = new Person<>("010-1234-5678");
//		
//		p3.setID(10);


		
		
		

	
		
	}

}
