package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	
	public static void main(String[] args) {
		
	//List : 순서를 유지하고 저장, 중복 저장
	// List<E> list = new ArrayList<E>();
	
	//ArrayList, Vector, LinkedList
	
	//Set : 순서를 유지하고 저장, 중복 저장 안됨
	//HashSet, TreeSet
	//Map : 키와 값의 쌍으로 저장, 키는 중복저장 안됨
	//HashMap, TreeMap
	
	List<String> list = new ArrayList<String>();
	//크기를 정할 수 있다. 
	list.add("길동길동고길동");
	list.add("찰스찰스김철수");
	list.add("고영희");
	list.add("박찬호");
	System.out.println(list.get(1));
	

	List<Integer> list2 = new ArrayList<Integer>();
	//크기를 정할 수 있다. 
	list2.add(30);
	list2.add(40);
	list2.add(10);
	list2.add(50);
	System.out.println(list2.get(1));
	System.out.println("총 객체수 : " + list2.size());
	System.out.println(list.get(3));
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
	System.out.println("=================");
	list.remove(2);
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
	System.out.println("======================");
	list.remove(2);
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	//삭제를 하면 뒤에 있는 자료들이 앞으로 땡겨진다.
	
	
		
	}
	
}
