package Excercise;

public class StringBuilderEx11 {

	public static void main(String[] args) {
		//11장 연습문제
		String str = "";
		for(int i=1; i<=100; i++) {
			str += i; //sum=sum+i
		}
		System.out.println(str);
		
		// 위코드로 작성하면 String 객체를 100개이상 생성하기 떄문에
		//메모리를 많이 잡아먹어 좋지 않은 코드다
		
		//개선 코드
		//StringBuilder 사용해서 만들기
		StringBuilder stb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			stb.append(i);
		}
		str=stb.toString();
		System.out.println(str);
		
		
	}

}
