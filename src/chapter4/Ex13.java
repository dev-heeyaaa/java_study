package chapter4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex13 {

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
		
		// set은 데이터 중복 불가 map도?
		//그래서 key를 set에다 전달
		
		Set<String> keySet = amazones.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			
			System.out.println(key + " = "+ amazones.get(key));
		}
		
	}

}
