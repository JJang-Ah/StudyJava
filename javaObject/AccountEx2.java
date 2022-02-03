package javaObject;

import java.util.Scanner;

public class AccountEx2 {

	public static void main(String[] args) {
		Account younghee=new Account("333-222-111222", "영희영희이영희", 100000);
		younghee.deposit(20000);
		younghee.withdraw(50000);
		
		Account chanho = new Account("123-123-123123","찬호찬호박찬호", 0);
		chanho.deposit(45000);
		chanho.withdraw(13000);	
		printAccount(younghee);
		printAccount(chanho);
			
	}
	
	//통장 자료 출력 메서드
	static void printAccount(Account obj) {
		System.out.println("계좌 번호 : " + obj.accountNo);
		System.out.println("예금주 : " + obj.ownerName);
		System.out.println("현재 잔액 : "+ obj.balance);
		System.out.println("===========================");	
	}
	

}
