package chapter3;
// ���׸��� Ÿ��
// E - Element
// K - Key
// V - Value
// T - Type
// N - Number
public class Person <T1, T2>{
	// �� ����
	private int eye;
	// �� ����
	private int nose;
	// �� ����
	private int mouth;
	// �ĺ���
	private T1 id;
	
	private T2 tel;
	 // ������ �����~
	public Person(T2 tel) {
		this.tel = tel;
	}
	
	public void setTel(T2 tel) {
		this.tel = tel;
	}
	
	public T2 getTel() {
		return tel;
	}
	
//	// ������
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
	// ��� �޼���
	public void setID(T1 id) { // setter�� ����� ���� �Ű������� �޾Ƽ� ��� ������ ���׸�Ÿ������ ���
		this.id = id;
		
	}

	
	public T1 getID() { // getter 
		return id;
	}
	
}
