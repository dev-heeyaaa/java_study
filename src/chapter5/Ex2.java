package chapter5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import chapter4.Customer;

public class Ex2 {

	public static void main(String[] args) {
		Customer customer1 = new Customer("010-1473-3698", "현금");
		Customer customer2 = new Customer("010-1598-1111", "카드");
		Customer customer3 = new Customer("010-1123-4567", "카드");
		Customer customer4 = new Customer("010-1478-4564", "현금");
		Customer customer5 = new Customer("010-2453-3456", "현금");
		
		Map<String, Customer> amazones = new HashMap<String, Customer>();
		amazones.put("홍길동", customer1);
		amazones.put("김철수", customer2);
		amazones.put("고영희", customer3);
		amazones.put("최강창민", customer4);
		amazones.put("황광희", customer5);
		
		
		Set<String> KeySet = amazones.keySet();
		for (String key : KeySet) {
			amazones.remove(key); // 모두 삭제
			
//			Customer c = amazones.get(key);
//			System.out.println(c.getTel());
//			System.out.println(c.getPaymentMethod());
			
			
		}
		//또는 이렇게도 모두 삭제 가능
		// amazones.clear();
		
	}

}
