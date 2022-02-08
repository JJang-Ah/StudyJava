package Javapro;

import JavaObject.Account;
import JavaObject.CheckingAccount;
import JavaObject.CreditLineAccount;

public class PolymorphisumEx1 { //다형성
	

	public static void main(String[] args) {
		Account obj1 = new Account();
		obj1.deposit(10000);
		CheckingAccount obj2 = new CheckingAccount();
		Account obj3 = new CheckingAccount(); //타입은 같지만 전혀 다른 객체를 가질 수 있다.
		Account obj4 = new CreditLineAccount();
		
		
	}

}
