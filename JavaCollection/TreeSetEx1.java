package JavaCollection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		set.add("applel");
		set.add("forever");
		set.add("description");
		set.add("bear");
		set.add("zoo");
		set.add("cherry");
		set.add("ice");
		
		System.out.println("c-k 사이의 단어 검색");
		NavigableSet<String> rangeSet = set.subSet("c", true, "k", true);
		//c부터 k 까지 c와k도 포함
		
		for(String m : rangeSet) {
			System.out.println(m);
		}
		
		
		
	}
}
