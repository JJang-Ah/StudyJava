package JavaCollection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(60), "홍길동");
		scores.put(new Integer(10), "김철수");
		scores.put(new Integer(80), "이영희");
		scores.put(new Integer(66), "김미향");
		scores.put(new Integer(97), "단단이");
		scores.put(new Integer(87), "수철씨");
		Map.Entry<Integer, String> entry = null;
		entry = scores.lastEntry(); //정보 전달
		System.out.println("최고 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.firstEntry();
		System.out.println("최저 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lowerEntry(new Integer(80));
		System.out.println("80점 아래 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.higherEntry(new Integer(60));
		System.out.println("60점 위 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.floorEntry(new Integer(60));
		System.out.println("60점 이거나 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.ceilingEntry(new Integer(80)); 
		System.out.println("80점 이거나 바로 위 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		while(!scores.isEmpty()) {
			entry=scores.pollFirstEntry(); //낮은 객체의 정보를 제거 (scores의 가장 낮은 정보를 entry로 전달)
			System.out.println(entry.getKey() + " - " + entry.getValue() + " -- 남은 객체 수 : " + scores.size());
		}
		

	}

}
