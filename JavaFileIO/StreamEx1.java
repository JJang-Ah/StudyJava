package JavaFileIO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {

//		int[] nums=new int[5];
		int[] nums= {10,20,30,44,23,10};
		
		List<Integer> list = new ArrayList<Integer>(); //���� �迭
		List<Integer> list2 = Arrays.asList(10,20,30); //����� ���ÿ� ���� �������ִ�.
		List<String> list3 = Arrays.asList("ȫ�浿","��¯��","���̸�");
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
			
		}
		System.out.println("================================");
		for(int number : nums) {
			System.out.println(number);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//list�� add�� �ִ´�.
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("=================================");
		Iterator<String> iter = list3.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("====================================");
		//Stream �̿�
		Stream<String> st = list3.stream();
		st.forEach(name -> System.out.println(name));
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
