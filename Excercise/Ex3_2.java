package Excercise;

public class Ex3_2 {

	public static void main(String[] args) {
		int score=85;
		String result = (!(score>90))?"가":"나";
		System.out.println(result);
		
		
		int amount=7;
		int price=5000;
		double rate=(amount>=10)?0.1:0.05;; //할인율을 보관할 변수
		//삼항연산자 => 수량이 10개이상이면 할인율10%, 미만이면5%
		int panme=(int)(amount*price*(1-rate));
		
		
				
		System.out.println("판매금액=" + panme);
		
		
		
		
	}

}
