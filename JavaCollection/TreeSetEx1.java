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
		
		System.out.println("c-k ������ �ܾ� �˻�");
		NavigableSet<String> rangeSet = set.subSet("c", true, "k", true);
		//c���� k ���� c��k�� ����
		
		for(String m : rangeSet) {
			System.out.println(m);
		}
		
		
		
	}
}
