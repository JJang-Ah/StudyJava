package javaObject;

public class AccountEx3 {

	public static void main(String[] args) {

		Account chulsu = new Account("222-111-313131", "철수철수박철수", 0);
		chulsu.deposit(30000);
		System.out.println("현재 잔액 : "+chulsu.balance);
		int amount=0;
		try { //try안의 블록은 예외처리가 발생 안했을때 처리
			
			amount=chulsu.withdraw(50000);
		System.out.println("인출 금액 : "+ amount);
		
		} catch (Exception e) { //catch는 예외 처리가 발생했을때 
			System.out.println("인출 급액 : "+ amount);
			System.out.println(e.getMessage());
			
			
		}
		
	}

}
