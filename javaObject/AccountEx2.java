package javaObject;

import java.util.Scanner;

public class AccountEx2 {

	public static void main(String[] args) {
		Account younghee=new Account("333-222-111222", "�������̿���", 100000);
		younghee.deposit(20000);
		younghee.withdraw(50000);
		
		Account chanho = new Account("123-123-123123","��ȣ��ȣ����ȣ", 0);
		chanho.deposit(45000);
		chanho.withdraw(13000);	
		printAccount(younghee);
		printAccount(chanho);
			
	}
	
	//���� �ڷ� ��� �޼���
	static void printAccount(Account obj) {
		System.out.println("���� ��ȣ : " + obj.accountNo);
		System.out.println("������ : " + obj.ownerName);
		System.out.println("���� �ܾ� : "+ obj.balance);
		System.out.println("===========================");	
	}
	

}
