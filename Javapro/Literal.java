package Javapro;

public class Literal {

	public static void main(String[] args) {
		int num1=25+367; // 정수는 바이너리가 한개 
		double num2=25.7+3.15;// 부동 소수점 수 = 실수
		//, 실수는 가수부 지수부 두개로 나누어진다.
//		가수부   지수부
//	 	0.257 *10^2
//   + 	0.0315*10^2
		double num3=5.0/2;
		int num4=015; //앞에 0을 넣으면 8진수로 인식한다.
		int num5=0xA6; //앞에 0x 를 넣으면 16진수 
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		double num6=5E7; // >>5곱하기 10의7승
		System.out.println(num6);
		
		char ch='A'; //큰따음표는 문자열, 작은따음표는 하나의 문자만 가능
		System.out.println(ch);

		int num7=65;
		System.out.printf("%d",  num7); // 65로 출력
		System.out.printf("%c",  num7); // A로 출력

		System.out.println(num7);
		
		boolean bool=true; // 참거짓 판별하는 명령문 보통 if문에 쓰임
		//true, false 는 문자가 아니다!
		System.out.println(bool);
		
		
		

		
	}

}
