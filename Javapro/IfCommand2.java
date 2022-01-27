package Javapro;

import java.util.Scanner;

public class IfCommand2 {

	public static void main(String[] args) {
		System.out.print("구입할 수량을 입력해 주라~ >> ");
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		System.out.print("상품 금액을 입력해주세요 >> ");
		int price=sc.nextInt();
		String memo="(정상가)";
		if (amount>=10 && price>= 1000) {
			price=(int)(price*0.80);
			memo="(할인가)";
		}
		System.out.println("판매금액="+price*amount+memo);
		
	}

}

//문제) 판매금액을 계산하는 프로그램을 완성하시오.
// 판매금액=수량*단가
//조건1) 수량이 10개이상이면 할인가를 적용
//조건2) 상품금액이 1000원 미만품목은 제외
