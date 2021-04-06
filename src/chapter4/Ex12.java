package chapter4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.security.auth.kerberos.KerberosKey;

public class Ex12 {

	public static void main(String[] args) {
		Map<String, Integer> classOneKor = new HashMap<String, Integer>();
		
		classOneKor.put("홍길동", 95);
		classOneKor.put("김철수", 18);
		classOneKor.put("고영희", 86);
		classOneKor.put("최강창민", 36);
		classOneKor.put("황광희", 69);
		
	
		
		Map<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("홍길동", "이코노미");
		hashMap.put("고영희", "비즈니스");
		hashMap.put("유노윤호", "퍼스트");
		hashMap.put("황광희", "이코노미");
		hashMap.put("김철수", "퍼스트");
		
		System.out.println();
		System.out.println("===== [ 승객들의 좌석 정보 ] =====\n");
		System.out.println(hashMap);
		System.out.println("\n======= ====== ====== =======");
		
		System.out.println();
		
		System.out.println("- 초기 상태: "+classOneKor);
		// put 메소드를 사용할 때 이미 존재하는 키에 데이터를 저장하면
		// 해당 키에 들어있던 데이터가 덮어씌워진다.
		classOneKor.put("홍길동", 73);
		System.out.println("- key = 홍길동, value = 73 추가: "+classOneKor);
		
		hashMap.put("유노윤호", "이코노미");
		System.out.println();
		System.out.println("===== [ 수정된 승객들의 좌석 정보 ] =====\n");
		System.out.println(hashMap);
		System.out.println("\n======== ======= ======= ========");
		
		classOneKor.remove("홍길동");
		
		System.out.println("key = 홍길동 삭제: "+classOneKor);
		
		hashMap.remove("황광희");
		System.out.println("황광희 좌석 등급 삭제: "+hashMap);
		System.out.println("\n======== ======= ======= ========");
		// Map이 가지고 있는 key를 Set으로 변환해서
		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			
			System.out.println(key + " = " + hashMap.get(key));
		}
		
	}

}
