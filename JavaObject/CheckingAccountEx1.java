package JavaObject;

public class CheckingAccountEx1 {

	public static void main(String[] args) {

		
		CheckingAccount chulsu = new CheckingAccount ("123-123-123123", "철수철수김철수"
				, 10000, "1111-2222-3333-4444");
		chulsu.deposit(50000);
		System.out.println("현재 금액 : " +chulsu.balance);
		try {
			int paidAmount = chulsu.pay("1111-2222-3333-4444", 900000);
			System.out.println("현재 금액 : " +chulsu.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//메소드 재정의 : (override) - 오버라이드 >> 많이 쓰인다.!!
		
		
		
		
	}

}
