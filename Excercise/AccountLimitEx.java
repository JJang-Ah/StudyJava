package Excercise;

public class AccountLimitEx {

	public static void main(String[] args) {

		// 6장 연습문제 19번
		AccountLimit account = new AccountLimit();
		
		account.setBalance(10000);
		
		account.setBalance(-90000);

		System.out.println("현재 잔고 : " + account.getBalance());
		
		
	}

}
