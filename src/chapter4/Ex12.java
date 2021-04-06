package chapter4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.security.auth.kerberos.KerberosKey;

public class Ex12 {

	public static void main(String[] args) {
		Map<String, Integer> classOneKor = new HashMap<String, Integer>();
		
		classOneKor.put("ȫ�浿", 95);
		classOneKor.put("��ö��", 18);
		classOneKor.put("����", 86);
		classOneKor.put("�ְ�â��", 36);
		classOneKor.put("Ȳ����", 69);
		
	
		
		Map<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("ȫ�浿", "���ڳ��");
		hashMap.put("����", "����Ͻ�");
		hashMap.put("������ȣ", "�۽�Ʈ");
		hashMap.put("Ȳ����", "���ڳ��");
		hashMap.put("��ö��", "�۽�Ʈ");
		
		System.out.println();
		System.out.println("===== [ �°����� �¼� ���� ] =====\n");
		System.out.println(hashMap);
		System.out.println("\n======= ====== ====== =======");
		
		System.out.println();
		
		System.out.println("- �ʱ� ����: "+classOneKor);
		// put �޼ҵ带 ����� �� �̹� �����ϴ� Ű�� �����͸� �����ϸ�
		// �ش� Ű�� ����ִ� �����Ͱ� ���������.
		classOneKor.put("ȫ�浿", 73);
		System.out.println("- key = ȫ�浿, value = 73 �߰�: "+classOneKor);
		
		hashMap.put("������ȣ", "���ڳ��");
		System.out.println();
		System.out.println("===== [ ������ �°����� �¼� ���� ] =====\n");
		System.out.println(hashMap);
		System.out.println("\n======== ======= ======= ========");
		
		classOneKor.remove("ȫ�浿");
		
		System.out.println("key = ȫ�浿 ����: "+classOneKor);
		
		hashMap.remove("Ȳ����");
		System.out.println("Ȳ���� �¼� ��� ����: "+hashMap);
		System.out.println("\n======== ======= ======= ========");
		// Map�� ������ �ִ� key�� Set���� ��ȯ�ؼ�
		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			
			System.out.println(key + " = " + hashMap.get(key));
		}
		
	}

}
