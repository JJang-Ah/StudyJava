package Javapro;


public class Hello { //객체 ex 리모컨
	/*
	 * 2022 - 01 -19
	 * 주석~
	 */

	public static void main(String[] args) { //메소드 ex 버튼 main은 전원버튼 
		System.out.println("하윙"); //ex 자동차.엔진.실린더 
		System.out.println(5+10);
		for(int i=0; i<5; i++) {
			System.out.println(i);	
		}
		
		int num1= 10;
		int num2= 0;
		if(num2==0) {
			System.out.println("0으로 나누면 안됩니다.");
		}else {
			int result=num1/num2;
		System.out.println("계산 결과 : " + result);
		}
		
	}

}
