package Excercise;

public class AccountLimitEx {

	public static void main(String[] args) {

		// 6�� �������� 19��
		AccountLimit account = new AccountLimit();
		
		account.setBalance(10000);
		
		account.setBalance(-90000);

		System.out.println("���� �ܰ� : " + account.getBalance());
		
		
	}

}
