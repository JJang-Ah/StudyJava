package JavaCollection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx2 {

	public static void main(String[] args) {

		TreeSet<Integer> set1 = new TreeSet<Integer>();
		set1.add(new Integer(50));
		set1.add(new Integer(40));
		set1.add(new Integer(10));
		set1.add(new Integer(30));
		set1.add(new Integer(80));
		set1.add(69);
		set1.add(99);
		set1.add(59);
		set1.add(70);
		set1.add(66);
		set1.add(86);
		//set1.remove(14); >> 14 자료를 삭제한다.
		//set1.clear(); >> 자료를 전부 학제한다.
		
		System.out.println("자료의 개수 : " + set1.size());
		System.out.println("최저 점수 : " + (set1).first()); //최솟값 구하는 메소드 
		// .first >treeset의 메소드라 캐스팅해주거나 선언을 Treeset으로 해주어야한다.
		System.out.println("최고 점수 : " + (set1).last()); // 최댓값 구하는 메소드
		
		System.out.println("80점 아래 점수 : " + set1.lower(new Integer(80)));
		System.out.println("90점 위 점수 : " + set1.higher(90));
		Iterator<Integer> iterator = set1.iterator();
		
		while(iterator.hasNext()) {
			Integer score = iterator.next();
			System.out.print(" " +score);
			//순서가 바뀐다.
			
		}
	}

}
