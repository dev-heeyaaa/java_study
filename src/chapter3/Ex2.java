package chapter3;

public class Ex2 {

	public static void main(String[] args) {
		Byte byteValue = Byte.valueOf((byte) 10);
		System.out.println(byteValue.byteValue());
		
		
		Short shortValue = Short.valueOf((short) 10);
		System.out.println(shortValue.shortValue());
		Integer integerValue = Integer.valueOf(10);
		System.out.println(integerValue.intValue());
		Long longValue = Long.valueOf((long) 10);
		System.out.println(longValue.longValue());
		Float floatValue = Float.valueOf((float) 3.14);
		
		System.out.println(floatValue.floatValue());
		Float floatValue2 = Float.valueOf("3.14");
		
		Double doubleValue = Double.valueOf(3.14);
		System.out.println(doubleValue.doubleValue());
		
		Character charValue = Character.valueOf('A');
		System.out.println(charValue.charValue());
		
		
		Boolean boolValue = Boolean.valueOf(false);
			

	}

}
