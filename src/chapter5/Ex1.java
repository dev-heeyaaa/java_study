package chapter5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex1 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		//set�� get �޼��尡 �������� ����
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// foreach
		// ���� for��
		// �ڹ� ������ �ƴ� �ٸ� ���� ���� �����ε� �ű⼭ foreach��� �ҷ��� �θ��ٳ����󳪤�����
		for (Integer i : set) {
			System.out.print(i+ " ");
		}
		
		// key�� �𸣴� ���? ex) ��Ʈ��ũ�κ��� ���� ���� �޾Ҵ�? ���� ���������� �� �ȿ� ����ִ� key�� �� �� �� -> KeySet ����ؼ� �ڵ鸵
		
		
	}

}
