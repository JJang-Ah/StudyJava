package javaObject;

public class AccountEx3 {

	public static void main(String[] args) {

		Account chulsu = new Account("222-111-313131", "ö��ö����ö��", 0);
		chulsu.deposit(30000);
		System.out.println("���� �ܾ� : "+chulsu.balance);
		int amount=0;
		try { //try���� ����� ����ó���� �߻� �������� ó��
			
			amount=chulsu.withdraw(50000);
		System.out.println("���� �ݾ� : "+ amount);
		
		} catch (Exception e) { //catch�� ���� ó���� �߻������� 
			System.out.println("���� �޾� : "+ amount);
			System.out.println(e.getMessage());
			
			
		}
		
	}

}
