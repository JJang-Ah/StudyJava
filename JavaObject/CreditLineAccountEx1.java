package JavaObject;

public class CreditLineAccountEx1 {

	public static void main(String[] args) {

		CreditLineAccount sundal = new CreditLineAccount("111-222-333333", "달수", 30000, 50000);
		
		
		
		try {
			int amount = sundal.withdraw(40000);
			System.out.println("인출액 : " + amount);
			System.out.println("잔액 : " + sundal.balance);
			System.out.println("마이너스 한도 : " + sundal.creditLine);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
