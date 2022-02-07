package Excercise;

public class AccountLimit {
	//6장 연습문제 19번
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
//		if (balance<Account.MIN_BALANCE ||balance>Account.MAX_BALANCE) {
//			System.out.println("숫자를 제대로 넣으세요 ;");
//			return;
//		}else {
//			this.balance += balance;
//			
//		}
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}else {
			System.out.println("금액을 다시 확인해 주세요");
		}
	}
	
	
	
	
}
