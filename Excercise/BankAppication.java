package Excercise;

import java.util.Scanner;

public class BankAppication{
	// 6장 연습문제 20번
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int count = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("===========================");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("==================================");
			System.out.print("선택 해주세요 >> ");
			int selectNo = scanner.nextInt();
			
			switch (selectNo) {
			
			case 1:
				createAccount();
				break;	// >> while 처음으로 간다.
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
			default:
				System.out.println("목록 선택이 잘못 되었습니다.");
				break;
			}
		}
		System.out.println("이용해주셔서 감사합니다^^");
	}

	private static void createAccount() {
		if(count >100) {
			System.out.println("더이상 계좌를 만들 수 없습니다.");
		}
		System.out.println("================");
		System.out.println("계좌 생성");
		System.out.println("=================");
		System.out.print("게좌 번호 : ");
		String ano = scanner.next();
		System.out.print("게좌주 : ");
		String owner = scanner.next();
		System.out.print("초기 입금액 : ");
		int balance = scanner.nextInt();
		Account newAccount = new Account(ano, owner, balance);
		accountArray[count] = newAccount;
		count++;	
		System.out.println("게좌가 생성 되었습니다. ");
	}
	
	private static void accountList() {
		System.out.println("============");
		System.out.println("계좌 목록");
		System.out.println("============");
		if(count==0) { 
			System.out.println("생성된 계좌가 없습니다.");
		}
		for(int i=0;i<count;i++) {
			System.out.println(accountArray[i].getAno()+"   "
					+accountArray[i].getOwner()+ "   " 
					+ accountArray[i].getBalance());			
		}
	}
	
	private static void deposit() {
		System.out.println("======================");
		System.out.println("예금");
		System.out.println("===================");
		System.out.print("계좌 번호 : ");
		String ano = scanner.next();
		Account account=findAccount(ano);
		if(account == null) {
			System.out.println("존재하지 않는 계좌입니다.");
		}
		System.out.print("예금액 : ");
		int plus = scanner.nextInt();
		account.setBalance(account.getBalance()+plus);
		System.out.println("예금이 완료 되었습니다.");
	}
	
	private static Account findAccount(String ano) {
		Account account=null;
		for(int i=0; i<count; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				account = accountArray[i];
				break;
			}
		}
		return account;
	}
	

	private static void withdraw() {
		System.out.println("======================");
		System.out.println("출금");
		System.out.println("===================");
		System.out.print("계좌 번호 : ");
		String ano = scanner.next();
		Account account=findAccount(ano);
		if(account == null) {
			System.out.println("존재하지 않는 계좌입니다.");
		}
		System.out.print("출금액 : ");
		int minus = scanner.nextInt();
		if (minus>account.getBalance()) {
			System.out.println("통장의 잔고가 부족합니다.");
		}else {
			account.setBalance(account.getBalance()-minus);
			System.out.println("출금이 완료 되었습니다.");
		}
	}
}
