package Excercise;

public class Ex3_7 {

	public static void main(String[] args) {
		
//		//예외 처리
//		try {
//		int num1=10;
//		int num2=0;
//		int result=num1/num2;
//		System.out.println(result);
//		
//		
//		}catch(ArithmeticException e/* */) {
//			System.out.println("0으로 나누지 말아라!");
//			
//		}
//	
		
		
		double num1=0;
		double num2=1;
		double result=num1/num2;
		if(Double.isInfinite(result) || Double.isNaN(result)) {
			System.out.println("값을 산출할 수 없습니다.");
			
		}else {
			System.out.println(result);
			
		}
			
		
		
	}

}
