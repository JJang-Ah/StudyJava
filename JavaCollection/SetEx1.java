package JavaCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {

		//Set(인터페이스) -  중복 불가능
		//구현 클래스
		//HashSet
		//TreeSet
		
		//Map(인터페이스)
		//HashMap
		//TreeMap
		
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("홍길똥");
		set1.add("신짱구");
		set1.add("봉미선");
		set1.add("나미리");
		set1.add("훈이");
		set1.add("신형만");
		set1.add("신짱구");
		
		set1.remove("훈이"); //set은 이렇게 값을 직접 적어넣어 삭제를 해야한다.
		// 인덱스값을 넣을수 없다.
		
		System.out.println("자료의 개수 : " + set1.size());
		// 중복된 자료는 같이 묶어서 하나로 친다.
		
		
		Iterator<String> iterator = set1.iterator(); 
		// Iterator : set 구조의 자료를 겁색할때 쓰는 인터페이스
		while(iterator.hasNext()) { //자료 수만큼 반복하게된다.
			String name = iterator.next();
			System.out.println("이름 : " + name);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
