package Javapro;

public class Expressions3 {

	public static void main(String[] args) {
		//증감 연산자 : ++ -- >> 무조건 라인하나에 단독으로 써야한다.
		int num1=10;
		num1++;
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		num1--;
		System.out.println(num1);
		System.out.println(++num1); //증가하고 출력
		System.out.println(num1++); // 출력하고 증가
		
		boolean play=true;
		System.out.println(play);
		System.out.println(!play); //!, ~ : 부정 연산자
		play=!play;
		System.out.println(play);
		
		int a = 20;
		int b = ~a;
		System.out.println(b);
		//비교 연산자 : >, >=, ==, !=, <, <=
		
		//논리 연산자 &&(AND), ||(OR), 
		//쉬프트 연산자 : << >> >>>
		
		int result=1 << 3; //왼쪽으로 3bit 이동
		System.out.println(result);
		
		int result1=8 >>2;
		System.out.println(result1);
		
		
		
		
		
	}

}
