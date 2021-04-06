package chapter5;

public enum Gender {
	MALE, FEMALE;
	


	public static Gender getGender(int value) {
		if(value == 1) {
			return Gender.MALE;
		} else if(value == 2) {
			return Gender.FEMALE;
		}else {
			throw new IllegalArgumentException();
		}

	}
}
// enum은 values라는 메서드를 컴파일러가 자동으로 추가해줌