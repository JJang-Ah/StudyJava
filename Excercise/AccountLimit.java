package Excercise;

public class AccountLimit {
	//6�� �������� 19��
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
//		if (balance<Account.MIN_BALANCE ||balance>Account.MAX_BALANCE) {
//			System.out.println("���ڸ� ����� �������� ;");
//			return;
//		}else {
//			this.balance += balance;
//			
//		}
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}else {
			System.out.println("�ݾ��� �ٽ� Ȯ���� �ּ���");
		}
	}
	
	
	
	
}
