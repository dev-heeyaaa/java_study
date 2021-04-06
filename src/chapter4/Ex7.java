package chapter4;

public class Ex7 {

	public static void main(String[] args) {
		Passenger p1 = new Passenger("홍길동", "010-7591-8524", "이코노미");
		Passenger p2 = new Passenger("홍길동", "010-7591-8524", "이코노미");
		
		
		// 원래 Object.class에 저장된 hashCode는 인스턴스의 메모리 주소를 해쉬화 하는 것!
		// 그래서! 메모리 주소의 해쉬화가 아니라 가지고 있는 값을 해쉬화 하도록 오버라이딩 해 줘야 하는 것!
		// 그럼! 빨리 Passenger 클래스로 가서 오버라이딩 하자~
		boolean same = p1.hashCode() == p2.hashCode();
		
		if(same) {
			System.out.println("p1과 p2가 같습니다");
		}else {
			System.out.println("p1과 p2가 다릅니다"); 
		}

	}

}
