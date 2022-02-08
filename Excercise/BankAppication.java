package Excercise;

import java.util.Scanner;

public class BankAppication{
	// 6�� �������� 20��
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int count = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("===========================");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("==================================");
			System.out.print("���� ���ּ��� >> ");
			int selectNo = scanner.nextInt();
			
			switch (selectNo) {
			
			case 1:
				createAccount();
				break;	// >> while ó������ ����.
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
				System.out.println("��� ������ �߸� �Ǿ����ϴ�.");
				break;
			}
		}
		System.out.println("�̿����ּż� �����մϴ�^^");
	}

	private static void createAccount() {
		if(count >100) {
			System.out.println("���̻� ���¸� ���� �� �����ϴ�.");
		}
		System.out.println("================");
		System.out.println("���� ����");
		System.out.println("=================");
		System.out.print("���� ��ȣ : ");
		String ano = scanner.next();
		System.out.print("������ : ");
		String owner = scanner.next();
		System.out.print("�ʱ� �Աݾ� : ");
		int balance = scanner.nextInt();
		Account newAccount = new Account(ano, owner, balance);
		accountArray[count] = newAccount;
		count++;	
		System.out.println("���°� ���� �Ǿ����ϴ�. ");
	}
	
	private static void accountList() {
		System.out.println("============");
		System.out.println("���� ���");
		System.out.println("============");
		if(count==0) { 
			System.out.println("������ ���°� �����ϴ�.");
		}
		for(int i=0;i<count;i++) {
			System.out.println(accountArray[i].getAno()+"   "
					+accountArray[i].getOwner()+ "   " 
					+ accountArray[i].getBalance());			
		}
	}
	
	private static void deposit() {
		System.out.println("======================");
		System.out.println("����");
		System.out.println("===================");
		System.out.print("���� ��ȣ : ");
		String ano = scanner.next();
		Account account=findAccount(ano);
		if(account == null) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
		}
		System.out.print("���ݾ� : ");
		int plus = scanner.nextInt();
		account.setBalance(account.getBalance()+plus);
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
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
		System.out.println("���");
		System.out.println("===================");
		System.out.print("���� ��ȣ : ");
		String ano = scanner.next();
		Account account=findAccount(ano);
		if(account == null) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
		}
		System.out.print("��ݾ� : ");
		int minus = scanner.nextInt();
		if (minus>account.getBalance()) {
			System.out.println("������ �ܰ� �����մϴ�.");
		}else {
			account.setBalance(account.getBalance()-minus);
			System.out.println("����� �Ϸ� �Ǿ����ϴ�.");
		}
	}
}
