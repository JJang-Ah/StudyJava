package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	
	public static void main(String[] args) {
		
	//List : ������ �����ϰ� ����, �ߺ� ����
	// List<E> list = new ArrayList<E>();
	
	//ArrayList, Vector, LinkedList
	
	//Set : ������ �����ϰ� ����, �ߺ� ���� �ȵ�
	//HashSet, TreeSet
	//Map : Ű�� ���� ������ ����, Ű�� �ߺ����� �ȵ�
	//HashMap, TreeMap
	
	List<String> list = new ArrayList<String>();
	//ũ�⸦ ���� �� �ִ�. 
	list.add("�浿�浿��浿");
	list.add("����������ö��");
	list.add("����");
	list.add("����ȣ");
	System.out.println(list.get(1));
	

	List<Integer> list2 = new ArrayList<Integer>();
	//ũ�⸦ ���� �� �ִ�. 
	list2.add(30);
	list2.add(40);
	list2.add(10);
	list2.add(50);
	System.out.println(list2.get(1));
	System.out.println("�� ��ü�� : " + list2.size());
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
	
	//������ �ϸ� �ڿ� �ִ� �ڷ���� ������ ��������.
	
	
		
	}
	
}
