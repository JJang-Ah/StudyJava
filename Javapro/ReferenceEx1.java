package Javapro;

public class ReferenceEx1 {

	public static void main(String[] args) {
		//기본타입(Primitive Type)
		// int, byte, long, float, double, boolean, 등등
		
//		//참조 타입(Reference Type)
//		String str="korea";
//		System.out.println(str);
//		//str 보통 1바이트로 출발 , 크기가 정해진게 아니다. 참조해서 쓰는 느낌 / 주소를 가지고 있다.
//		
//		
//		
//		//str : 번지 >> 다름 기억장소에 있다가  >>참조 타입
//		
//		
//		String kor="이게 마 한국이다.";
//		System.out.println(kor);
//		str="computer";
//		System.out.println(str);
//		str=null;
//		System.out.println(str);
		
		String strValue1="홍길동"; //String >> 객체 >객체는 메소드를 가진다.
		String strValue2="홍길동";
		if(strValue1 == strValue2) {
			System.out.println("strValue1과 strValue2는 참조가 같음");
			
		}else {
			System.out.println("strValue1과 strValue2는 참조가 다름");		
		}
		
		if(strValue1.equals(strValue2)) {
			System.out.println("strValue1과 strValue2는 문자열이 같음");
		}
		
		String strValue3=new String("홍길동"); //new 라는 것은 새로운 메모리 번지를 만들어 낸다.
		String strValue4=new String("홍길동"); 
		
		if(strValue3 == strValue4) { //번지가 다르기 때문에 참조가 다르다 / String은 주소인셈
			System.out.println("strValue3과 strValue4는 참조가 같음");
			
		}else {
			System.out.println("strValue3과 strValue4는 참조가 다름");		
		}
		
		if(strValue3.equals(strValue4)) {
			System.out.println("strValue3과 strValue4는 문자열이 같음");
		}
		
		System.out.println(strValue1.equals(strValue2));
		
				
	}

}
