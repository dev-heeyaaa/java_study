package chapter1;

// 나만의♡ 예외 클래스 만들기~
// MyException이 ArrayIndexOUtof바운드익셈션... 등과 동일한 예외가 된다.
public class MyException extends Exception{
	// 직렬화
	private static final long serialVersionUID = -2103221287283272330L;
	
	// msg -> 예외가 왜 발생했는지, 사유임
	public MyException(String msg) {
		super(msg);
		
	}
}
