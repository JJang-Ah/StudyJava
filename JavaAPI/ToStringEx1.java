package JavaAPI;

import java.util.Date;

public class ToStringEx1 {

	public static void main(String[] args) {

		//ToString >> ���ڿ��� �������ش�.
		
		String str1 = "ȫ�浿";
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
