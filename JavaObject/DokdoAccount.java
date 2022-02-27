package JavaObject;

public class DokdoAccount extends Account {
	int point;
	
	public DokdoAccount(String accountNo, String ownerName, int balance) {
		super(accountNo, ownerName, balance);
		
	}
	public DokdoAccount() {
	}
	@Override
	public void deposit(int amount) {
		super.deposit(amount);
		point += amount*0.01;
	}
	
	
	
}
