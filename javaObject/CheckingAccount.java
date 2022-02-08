package JavaObject;

public class CheckingAccount extends Account {
	String cardNo; //üũī�� ��ȣ �ʵ�
	
	public CheckingAccount(String accountNo, String ownerName, int balance,
			 String cardNo) {
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//		this.balance = balance;
		//�� ó�� �ص������� �ѹ��� �θ� �ʵ带 �ҷ��ִ� super �� �ִ�.
		super (accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	public CheckingAccount() {
	}
	
	//�޼ҵ�
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo)|| this.balance < amount) {
			throw new Exception ("������ �Ұ��� �մϴ�.");
		}
//		balance -= amount;
//		return amount;
		// ��ó�� �ص� ������
		return withdraw(amount);
	}
	
	

}
