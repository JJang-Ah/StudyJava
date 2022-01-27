package Javapro;

public class Expressions4 {

	public static void main(String[] args) {
		//복합대입 연산자
		// += -= *= /= %= 
		int result=20;
		result+=10; //result=result+10;
		System.out.println(result);
		
		//삼항연산자
		//조건? 값 또는 연산식(참일때) : 값 또는 연산식 (참이아닐때)
		int num1=30, num2=100;
		int max;
		max=(num1>num2)?num1:num2;
		System.out.println("두 수 중 큰 값= "+max+ "입니다.");
		
		
	}

}
