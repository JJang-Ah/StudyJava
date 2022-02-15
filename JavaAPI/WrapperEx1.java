package JavaAPI;

public class WrapperEx1 {

	public static void main(String[] args) {
		
		//Boxing(객체타입)
		Integer intobj1 = new Integer(50);
		Integer intobj2 = new Integer("100");
		Integer intobj3 = Integer.valueOf("200");
		
		//UnBoxing(객체타입 -> 기본타입)
		int value1 = intobj1.intValue();
		int value2 = intobj2.intValue();
		int value3 = intobj3.intValue();
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		Integer obj4=new Integer(500);
		int num = obj4; //자동 언박싱
		Integer obj = 100; //자동 박싱
		String str1="100";
		String str2="200";
		System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
		

		
	}

}
