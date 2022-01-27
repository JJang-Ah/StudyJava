package Javapro;

public class Calc {

	public static void main(String[] args) {
		
		int num1=5; //변수 처음은 영어로 한다. 숫자로 시작 x
		int num2=3; // $ab 특수 기호는 앞에 써도된다.
		System.out.println(5+2);
		System.out.println(5-2);
		System.out.println(5*2);
		System.out.println(5/2); // 데이터 타입니 정수라 소수점 안나온다
		System.out.println(5/3);

		System.out.print(5-2); // ln이 없으면 이어서나온다
		System.out.print(5*2);
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println("num1/num2="+num1/num2);
		System.out.println("num1/num2="+num1+num2); 
		// 개별로 나오게된다. >> +의 연산 우선순위 차이

		System.out.println("철수"+"파이팅!");
		
	}

}
