package javaObject;

public class AccountEx1 {

	public static void main(String[] args) {	//메인 메소드는 자바가 제일 먼저 실행하는 메서드
		Account chulsu; //객체 변수 선언
		chulsu=new Account(); //객체 생성 (인스턴스화)
		//int num1; 일반 변수
		//Account chulsu; //객체 변수
		int amount = 0; //금액을 담는 변수
		
		chulsu.accountNo = "123-456-123456"; //accountNo - 필드, ~() << 괄호가있으면 메소드 없으면 필드 // 필드는 객체가 저장되는곳
		chulsu.ownerName = "철수철수김철수";
		chulsu.balance = 150000;
		
		Account gildong=new Account(); //객체 생성 (인스턴스화
		gildong.accountNo="111-222-333444";
		gildong.ownerName= "길동길동홍길동";
		gildong.balance= 100000;
		
		chulsu.deposit(3000);
		System.out.println(chulsu.balance);
		gildong.deposit(10000);
		System.out.println(gildong.balance);
		try {
			amount=gildong.withdraw(40000);
			gildong.withdraw(39999999);
			System.out.println(gildong.balance);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
			System.out.println("예금주 이름 : " + chulsu.ownerName);
			System.out.println("잔액 : " + chulsu.balance);
			System.out.println("==================================");
			System.out.println("예금주 이름 : " + gildong.ownerName);
			System.out.println("찾은 금액 " + amount);
			System.out.println("잔액 : " + gildong.balance);
		
		
	}

}
