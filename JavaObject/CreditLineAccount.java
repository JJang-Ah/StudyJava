package JavaObject;

public class CreditLineAccount extends Account { //JAVA는 상속을 하나만 받을 수 있다. 다른언어와는 달리 다중상속 허용하지 않는다.
	 //다중 상속이 된다면 같은이름의 메소드의 부모가 누구인지 알수없기 때문이다.
	int creditLine; //마이너스 한도
	//생성자 
	
	public CreditLineAccount(String accountNo, String ownerName, int balance,
			 int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	public CreditLineAccount() {
	}
	//메소드 재정의 : (override) - 오버라이드 >> 많이 쓰인다.!
	//메소드를 수정해서 사용한다. 
	@Override // << 어노테이션 // 어느 메소드가 자식 클래스에서 오버라이드 되었는지 알게 해준다. >컴파일러에게 문법 체크를 하도록 알린다.
	public int withdraw(int amount) throws BalanceLackException{ //override 해도 안에 내용만 수정가능하고 겉은 수정할 수 없다.
		if((balance+creditLine) < amount) {
			throw new BalanceLackException ("출금이 불가 합니다.");
		}
	
	balance -= amount;
	return amount;
	}
	
}
