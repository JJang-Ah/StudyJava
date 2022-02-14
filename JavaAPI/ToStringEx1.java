package JavaAPI;

import java.util.Date;

public class ToStringEx1 {

	public static void main(String[] args) {

		//ToString >> 문자열을 리턴해준다.
		
		String str1 = "홍길동";
		System.out.println(str1);
		
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		System.out.println(str1.toString());
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		
		System.out.println(obj2);
		System.out.println(obj2.toString());
		
	}

}
