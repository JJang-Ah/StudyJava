package JavaObject;

public class AccountEx4 {

	public static void main(String[] args) { 
		final int num1=30; //final은 값을 한번만 가질수 있다 최종적이라는 으미
		final double pi=3.14;
		int radius=5;
		double area=radius*radius*pi;
		System.out.println("결과 : " + area);
		radius = 10;
//		pi=4.2; //fianl 이기떄문에 값을 바꾸면 에러가 뜬다.
//		area=radius*radius*pi;
		
		//static >> 고정
		//final >> 처음 입력된 값이 최종값
		// 상수(static final) >> 불변의 값
		
		

	}

}
