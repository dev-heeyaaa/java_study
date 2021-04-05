package chapter3;
// 제네릭스 타입
// E - Element
// K - Key
// V - Value
// T - Type
// N - Number
public class Person <T1, T2>{
	// 눈 개수
	private int eye;
	// 코 개수
	private int nose;
	// 입 개수
	private int mouth;
	// 식별값
	private T1 id;
	
	private T2 tel;
	 // 생성자 만들기~
	public Person(T2 tel) {
		this.tel = tel;
	}
	
	public void setTel(T2 tel) {
		this.tel = tel;
	}
	
	public T2 getTel() {
		return tel;
	}
	
//	// 생성자
//	public Person(int eye, int nose, int mouth, T id) {
//		this.eye = eye;
//		this.nose = nose;
//		this.mouth = mouth;
//		this.id = id;
//	}
//


//	public void add(T val1, T val2) {
//		System.out.println(1);
//	}
//	
	// 멤버 메서드
	public void setID(T1 id) { // setter로 사용할 때는 매개변수로 받아서 멤버 변수로 제네릭타입으로 사용
		this.id = id;
		
	}

	
	public T1 getID() { // getter 
		return id;
	}
	
}
