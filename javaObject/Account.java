package javaObject;

//은행 계좌 클래스

public class Account {
	//필드(Field) - 객체의 데이터가 저장되는 곳
	String accountNo; //계좌번호
	String ownerName; //예금주 이름
	int balance; //잔액
	//생성자(Constructor) - 객체 생성시 초기화 역할 담당 //197p
	public Account(String accountNo, String ownerNa, int bal) { //컨트롤 스페이스로 생성해서 이 생성자에 필드에서 받은 값들을 가져온다.
		this.accountNo=accountNo; // 매개변수와 필드 이름을 같게 하려면 이렇게 할 수있다. //이름 구분하기 위해 this
		ownerName=ownerNa; // 보통은 이렇게 매개변수와 필드이름에 차별을 두어 좀더 가독성 있게 만든다.
		balance=bal;
	}
	
	//기본 생성자(Default Constructor
	//기본 생서자를 만들면 객체에 매개 변수를 입력하지않아도 빈 인스턴스가 만들어진다.
	public Account() {
	}
	
	
	//메서드 (Method) - 객체의 동작
	
	//예금한다.
	void deposit (int amount) {	// void 타입  , deposit << 메소드 명 // void 이외의 타입을 쓸대에는 return이 필요하다. void는 필요하지 않다.
			//void는 비어있는 뜻 리턴값이 없이 과정만 가진다.
		
		balance+=amount;
	}
	
	//출금한다.
	int withdraw (int amount) {
		if(balance < amount) {
			return 0;
		}
		balance -= amount;
		return amount;	
	}
	
	
}
