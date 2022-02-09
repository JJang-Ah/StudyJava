package JavaObject;

public class PolymorphisumEx1 { //다형성
	

	public static void main(String[] args) {
		Account obj1 = new Account();
		obj1.deposit(10000);
		CheckingAccount obj2 = new CheckingAccount();
		Account obj3 = new CheckingAccount(); //타입은 같지만 전혀 다른 객체를 가질 수 있다.
		Account obj4 = new CreditLineAccount();
		castProcess(obj3);
		castProcess(obj1);
		castProcess(obj4);
		//강제 캐스팅
		try {
		CheckingAccount obj5 = (CheckingAccount) obj1;
		System.out.println("변환 성공!");
		}catch(ClassCastException e){
			System.out.println("변환 실패~");
			
		}
		try {
			CheckingAccount obj5 = (CheckingAccount) obj3;
			System.out.println("변환 성공!");
			}catch(ClassCastException e){
				System.out.println("변환 실패~");
				
			}		
	}
	public static void castProcess(Account acc) {
		if(acc instanceof CheckingAccount) {
			CheckingAccount obj5 = (CheckingAccount)acc;
			System.out.println("오 인스턴스 맞노 그래서 캐스팅 했다");
		}else {
			System.out.println("캐스팅 못한다.");
		}
	}

}
