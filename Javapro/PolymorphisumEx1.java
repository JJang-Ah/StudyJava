package Javapro;

import JavaObject.Account;
import JavaObject.CheckingAccount;
import JavaObject.CreditLineAccount;

public class PolymorphisumEx1 { //������
	

	public static void main(String[] args) {
		Account obj1 = new Account();
		obj1.deposit(10000);
		CheckingAccount obj2 = new CheckingAccount();
		Account obj3 = new CheckingAccount(); //Ÿ���� ������ ���� �ٸ� ��ü�� ���� �� �ִ�.
		Account obj4 = new CreditLineAccount();
		
		
	}

}
