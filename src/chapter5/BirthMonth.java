package chapter5;

public enum BirthMonth {
	Jan("1월"), Feb("2월"), Mar("3월"), Apr("4월"), May("5월"), Jun("6월"), Jul("7월"), Aug("8월"), Sep("9월"), 
	Oct("10월"), Nov("11월"), Dec("12월");
	private final String korMonth; // 위에 처럼 값을 주려면(한글) 생성자를 만들어야 함
	
	BirthMonth(String korMonth) {
		this.korMonth = korMonth;
	}

	public String getKorMonth() {
		return korMonth;
	}
	
	public static BirthMonth getBirthMonth(String month) {
		BirthMonth[] birthMonthArr = BirthMonth.values();
		BirthMonth result = null;
		for (BirthMonth birthMonth : birthMonthArr) {
			String korMonth = birthMonth.getKorMonth();
			
			if(month.equals(korMonth)) {
				result = birthMonth;
			}
		}return result; 
 
	} 
}
 