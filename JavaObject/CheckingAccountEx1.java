package JavaObject;

public class CheckingAccountEx1 {

	public static void main(String[] args) {

		
		CheckingAccount chulsu = new CheckingAccount ("123-123-123123", "ö��ö����ö��"
				, 10000, "1111-2222-3333-4444");
		chulsu.deposit(50000);
		System.out.println("���� �ݾ� : " +chulsu.balance);
		try {
			int paidAmount = chulsu.pay("1111-2222-3333-4444", 900000);
			System.out.println("���� �ݾ� : " +chulsu.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//�޼ҵ� ������ : (override) - �������̵� >> ���� ���δ�.!!
		
		
		
		
	}

}
