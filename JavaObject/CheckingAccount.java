package JavaObject;

public class CheckingAccount extends Account {
	String cardNo; //체크카드 번호 필드
	
	public CheckingAccount(String accountNo, String ownerName, int balance,
			 String cardNo) {
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//		this.balance = balance;
		//위 처럼 해도되지만 한번에 부모 필드를 불러주는 super 가 있다.
		super (accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	public CheckingAccount() {
	}
	
	//메소드
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo)|| this.balance < amount) {
			throw new Exception ("지불이 불가능 합니다.");
		}
//		balance -= amount;
//		return amount;
		// 위처럼 해도 되지만
		return withdraw(amount);
	}
	
	

}
