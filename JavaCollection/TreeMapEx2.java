package JavaCollection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx2 {

	public static void main(String[] args) {

		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(60), "홍길동");
		scores.put(new Integer(10), "김철수");
		scores.put(new Integer(80), "이영희");
		scores.put(new Integer(66), "김미향");
		scores.put(new Integer(97), "단단이");
		scores.put(new Integer(87), "수철씨");
		
		NavigableMap<Integer, String> descMap = scores.descendingMap(); //내림 차순
		Set<Map.Entry<Integer, String>> descSet = descMap.entrySet();
		for(Map.Entry<Integer, String> entry : descSet) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println("===============================================");
		
		NavigableMap<Integer, String> descMap2 = descMap.descendingMap();  //내림차순에 또 내림차순을 해서 오름차순으로 만듦
		Set<Map.Entry<Integer, String>> descSet2 = descMap2.entrySet();
		for(Map.Entry<Integer, String> entry : descSet2) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		
		
	}

}
