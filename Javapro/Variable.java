package Javapro;

public class Variable {

	public static void main(String[] args) {
		int value;
		value=10;
		int result=value+10;
		System.out.println(result);
		
		String memo="";
		int amount=17;
		int price=1000;
		if(amount>=10) {
			price=800;
			memo="(할인가 적용)";

			System.out.println(memo);
		}
		System.out.println("판매금액 = "+amount*price + "원");
		
		
		
		
	}

}
