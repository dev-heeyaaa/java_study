package chapter5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import chapter4.Customer;

public class Ex2 {

	public static void main(String[] args) {
		Customer customer1 = new Customer("010-1473-3698", "����");
		Customer customer2 = new Customer("010-1598-1111", "ī��");
		Customer customer3 = new Customer("010-1123-4567", "ī��");
		Customer customer4 = new Customer("010-1478-4564", "����");
		Customer customer5 = new Customer("010-2453-3456", "����");
		
		Map<String, Customer> amazones = new HashMap<String, Customer>();
		amazones.put("ȫ�浿", customer1);
		amazones.put("��ö��", customer2);
		amazones.put("����", customer3);
		amazones.put("�ְ�â��", customer4);
		amazones.put("Ȳ����", customer5);
		
		
		Set<String> KeySet = amazones.keySet();
		for (String key : KeySet) {
			amazones.remove(key); // ��� ����
			
//			Customer c = amazones.get(key);
//			System.out.println(c.getTel());
//			System.out.println(c.getPaymentMethod());
			
			
		}
		//�Ǵ� �̷��Ե� ��� ���� ����
		// amazones.clear();
		
	}

}
