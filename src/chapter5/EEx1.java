package chapter5;

import java.util.Arrays;

public class EEx1 {

	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		Gender[] genderArray = Gender.values(); // enum 안에 있는 모든 데이터를 배열로 가져옴
		
		for (int i = 0; i < genderArray.length; i++) {
			Gender gender = genderArray[i];
			System.out.println(gender);
		}
		
		for (Gender gender1 : genderArray) {
			System.out.println(gender1);
		}
		System.out.println(Arrays.toString(genderArray));
		
		BirthMonth[] bmArray = BirthMonth.values();
		
		for (BirthMonth birthMonth : bmArray) {
			System.out.println(birthMonth);
		}
		
		System.out.println(Arrays.toString(bmArray));
	}
	
	
	

}
