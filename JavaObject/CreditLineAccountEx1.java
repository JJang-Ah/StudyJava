package JavaObject;

public class CreditLineAccountEx1 {

	public static void main(String[] args) {

		CreditLineAccount sundal = new CreditLineAccount("111-222-333333", "�޼�", 30000, 50000);
		
		
		
		try {
			int amount = sundal.withdraw(40000);
			System.out.println("����� : " + amount);
			System.out.println("�ܾ� : " + sundal.balance);
			System.out.println("���̳ʽ� �ѵ� : " + sundal.creditLine);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
