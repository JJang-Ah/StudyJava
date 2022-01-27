package Javapro;

import java.util.Scanner;

public class Expressions2 {

	public static void main(String[] args) {
		System.out.print("금액을 입력해주세요>> ");
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
//		int man=money/10000;
//		int ochun=(money-man*10000)/5000;
//		int chun=(money-man*10000-ochun*5000)/1000;
//		int oback=(money-man*10000-ochun*5000-chun*1000)/500;
//		int back=(money-man*10000-ochun*5000-chun*1000-oback*500)/100;
//		int sip=(money-man*10000-ochun*5000-chun*1000-oback*500-back*100)/10;
//		
//		System.out.println("만원권 : "+man+"장");
//		System.out.println("오천원권 : "+ochun+"장");
//		System.out.println("천원권 : "+chun+"장");
//		System.out.println("오백원권 : "+oback+"장");
//		System.out.println("백원권 : "+back+"장");
//		System.out.println("십원권 : "+sip+"장");
//		
		int man=money/10000;
		money=money%10000; // money%=10000;
		int ochun=money/5000;
		money%=5000;
		int chun=money/1000;
		money%=1000;
		int oback=money/500;
		money%=500;
		int back=money/100;
		money%=100;
		int sip=money/10;

		System.out.println("만원권 : "+man+"장");
		System.out.println("오천원권 : "+ochun+"장");
		System.out.println("천원권 : "+chun+"장");
		System.out.println("오백원권 : "+oback+"장");
		System.out.println("백원권 : "+back+"장");
		System.out.println("십원권 : "+sip+"장");

	}

}
