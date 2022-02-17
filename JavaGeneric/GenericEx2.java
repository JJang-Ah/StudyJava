package JavaGeneric;

import java.util.ArrayList;
import java.util.List;

public class GenericEx2 {

	public static void main(String[] args) {

//		List list = new ArrayList();
//		list.add(2.5);
//		list.add("대한민국~");
//		list.add(5);
//		list.add(false);
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		List list = new ArrayList();
		list.add("우리나라");
		list.add("대한민국");
		list.add("만만세다");
		list.add("하하하하");
		String str = (String)list.get(1);
		
		List<String> list2 = new ArrayList(); 
		//제네릭을 사용하면 강제 타입변환을 하지않아도된다.
		list2.add("우리나라");
		list2.add("대한민국");
		list2.add("만만세다");
		list2.add("하하하하");
		String str2 = list2.get(2);
		
		
	}

}
