package Excercise;

public class Ex3_7 {

	public static void main(String[] args) {
		
//		//���� ó��
//		try {
//		int num1=10;
//		int num2=0;
//		int result=num1/num2;
//		System.out.println(result);
//		
//		
//		}catch(ArithmeticException e/* */) {
//			System.out.println("0���� ������ ���ƶ�!");
//			
//		}
//	
		
		
		double num1=0;
		double num2=1;
		double result=num1/num2;
		if(Double.isInfinite(result) || Double.isNaN(result)) {
			System.out.println("���� ������ �� �����ϴ�.");
			
		}else {
			System.out.println(result);
			
		}
			
		
		
	}

}
