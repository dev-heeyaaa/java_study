package chapter3;
//���׸��� (Generics)
public class ex1 {

	public static void main(String[] args) {
		ClassName<Object> object1 = new ClassName<>();// �̷��� ������ ����
		ClassName<String> object2 = new ClassName<>();
		
		
		ClassName<Integer> object3 = new ClassName<Integer>();
		ClassName<Double> object4 = new ClassName<Double>();
		
//		Person<String> p1 = new Person<String>();
//		Person<String> p2  = new Person<>();

		
		// ���׸� Ÿ�� �ڸ����� �⺻ ������ Ÿ���� �� �� ����
		// ���׸� Ÿ�� �ڸ����� Ŭ������ �� ���� �ִ�
		// �⺻ ������ Ÿ���� Ŭ������ �����ξ���.
		// ����, �Ǽ�, ���ڸ� ���׸� Ÿ�� �ڸ��� ������
		// �⺻ ������ Ÿ���� Ŭ������ ������ Ŭ������ ����ؾ� �Ѵ�.
		Person<Integer> p3 = new Person<>(1012345678);
		
		Person<String, Integer> p4 = new Person<>("010-1234-5678");
//		
//		p3.setID(10);


		
		
		

	
		
	}

}
