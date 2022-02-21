package JavaCollection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {

		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 133); //Map 은 .put 으로 자료를 집어넣는다.
		
		map.put("김철수", 90);
		map.put("신짱구", 30);
		map.put("훈이", 12);
		map.put("맹구", 88);
		
		map.remove("김철수"); //삭제 할때에는 키값만 입력하면 된다.
		
		System.out.println("자료 개수 : " + map.size());
		System.out.println(map.get("홍길동")); // .get 으로 키를 입력하여 값을 출력한다.
		//출력하는 방법
		// 1. KeySet 활용
		System.out.println("**성적 리스트**");
		for(String name : map.keySet()) {
			System.out.println("[이름]" + name + " / [점수] : " + map.get(name));	
		}
		// 2. entrySet 활용 - 권장!!
		System.out.println("**성적 리스트**");
		for(java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("이름 : " + entry.getKey() + 
					" / 점수 : " +entry.getValue());
		}
		
		
		
		
		
		
		
		
	}

}
