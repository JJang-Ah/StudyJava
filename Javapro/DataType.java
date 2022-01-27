package Javapro;

public class DataType {

	public static void main(String[] args) {
		// 타입(형) 변수이름;
		// 타입(형) 변수이름=값;
		//타입 종류 정수, 실수, 논리
		//byte char short int long
		// 1byte = 8bit
		byte num1=-128; //이러면 한 바이트에 저장, 최대 127까지 가능
		// 0111 1111 >> 127 , 1111 1111 > -127 맨앞 숫자는 음수양수 표현
		// 그걸 부호비트라고 한다.
		//byte => -128 ~ 127
		// -128 = 1000 0000
		// 1111 1111 = -1 이거 뭐야?!?!
//		7-3 > 111 - 011 > 111+100+1 > 1100 = -4
//		컴퓨터는 빼기를 못한다.
		System.out.println(num1);
		short num2=300; // short >> 2byte=16bit 기억장소
//		short > -32768 ~ 32767
//		int 는 4byte => -2147483648 ~ 2147483647
		System.out.println(num2);
//		long 은 8byte
		long num3=2200000000L; //L 분이면 literal 자체도 롱이라는것 !
		System.out.println(num3);
		
//		char 은 2byte 인데 좀 특별하다.
		// 문자를 표현하는 단위
//		0~65535
		char ch=44032;
		char ch1='가'; //'가'는 아스키코드로 
		
		System.out.println(ch);
		System.out.println(ch1);
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ여기까지 정수 타입 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		이제부터는 실수 타입~~
//		float > 4byte 실수형
//		지수 8bit + 가수 23bit 25.37 > 0.2537*10^2 >가수:2537,지수:2
//		double > 8byte 실수형
//		지수 11 가수 52bit
		float num4=2.5f; //f는 숫자 자체를 float 공간으로 활용 
//		숫자 자체는 double로 되어있기 때문
		System.out.println(num4);
		double num5=45.36;
		System.out.println(num5);
		// boolean 은 논리값 ex true false
		boolean stop=true;
		if(stop) {
			System.out.println("중지!!!!");
			
		}else {
			System.out.println("시작!!!");
			
		}
		
		
	}

}
