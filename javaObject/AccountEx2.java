package JavaObject;


public class AccountEx2 {

	public static void main(String[] args) {
		Account younghee=new Account("333-222-111222", "영희영희이영희", 100000);
		younghee.deposit(20000);
		younghee.bankName = "신한은행"; //영희만 바꿧지만 찬호의 은행도 바뀐다.
				// 개체를 생성하지 않는 정적인 static 이기 떄문
//		younghee.home="서울"; // static final 이라서 바꿀 수없다.
		try {
			younghee.withdraw(50000);
		}catch(BalanceLackException e) {
			System.out.println(e.getMessage());
		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		Account chanho = new Account("123-123-123123","찬호찬호박찬호", 0);
		chanho.deposit(45000);
		try {
			chanho.withdraw(130000);	
		} catch (Exception e) {
			System.out.println(e);
		}
		
		printAccount(younghee);
		printAccount(chanho);
		printAccount(new Account("123-123", "익익명", 101000));
		
			
	}
	
	//통장 자료 출력 메서드
	static void printAccount(Account obj) {
		System.out.println("거래은행 : " + Account.bankName); //Account 클래스의 정적 객체?
		System.out.println("거래은행 : " + obj.bankName);
		System.out.println("위치 : " + obj.home);
		System.out.println("계좌 번호 : " + obj.accountNo);
		System.out.println("예금주 : " + obj.ownerName);
		System.out.println("현재 잔액 : "+ obj.balance);
		System.out.println("===========================");	
	}
	

}
