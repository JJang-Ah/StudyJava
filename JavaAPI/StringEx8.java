package JavaAPI;

public class StringEx8 {

	public static void main(String[] args) {

		String str= "     안녕";
		System.out.println(str.length());
		
		String str2 = str.trim(); //공백을 지워준다.
		System.out.println(str2);
		System.out.println(str2.length());
		
		
		String num1 = "12";
		String num2 = "34";
		//parseint >> 문자값을 정수값으로 바꿔준다.
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
		
		String str3 = String.valueOf(20); //valueof >> 모든 값을 문자로 바꿔준다.
		String str4 = String.valueOf(40);
		System.out.println(str3+str4);
		
		String text = "홍길동, 김철수, 이영희$ 짱구% 장우혁";
		//split 구분자 
		String[] names = text.split(",|$|%");  // |를이용해 다양한 구분자를 만들수잇다.
		//,를 경계로 문자열을 나누어주며 ,는 문자열에 들어가지 않는다.
		for(String m : names) {
			System.out.println(m.trim());
		}
		
		
		
	}

}
