package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {

	public static void main(String[] args) {

		
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		String str;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			str=String.valueOf(i);
			list1.add(str);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �۾��� �ɸ��ð� : " + (endTime-startTime) + "ns");

		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			str=String.valueOf(i);
			list2.add(str);
		}
		endTime = System.nanoTime();
		System.out.println("LindedList �۾��� �ɸ��ð� : " + (endTime-startTime) + "ns");

		//�۾� �ӵ��� LinkedList�� ArrayList���� ������.
		
	}

}
