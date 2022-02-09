package JavaInterface;

public interface iAnimal {
// 인터페이스 - 객체 사용 설명서
	//인터페이스 (interface)
	//1. class 키워드 대신 interface 키워드를 사용해서 정의한다.
	//2. 내부에는 추상메소드를 선언해서 가지고있다.
	//3. 클래스에서 인터페이스를 받아서 완성할 때 implements(구현) 키워드를 사용
	// ~ 자바는 다중 상속을 지원하지 않지만, 인터페이스를 사용하여 다중 상속과 비슷하게 작성하여 활용할 수있다.
	
	//추상 메서드 >> 본체가 없다.
	abstract void eat();
	abstract void sleep(); 

		
}
