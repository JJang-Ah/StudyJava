package JavaInterface;

public class iMonkey extends Animal implements iAnimal{

	//Animal를 상속받고 interface로 iAnimal를 사용하여
	// 다중상속 비슷하게 할 수있다.
	
	@Override
	public void eat() {
		System.out.println("바나나를 먹눈당");
		
	}

	@Override
	void move() {
		System.out.println("두발로 이동 한다...!");
		
	}

	@Override
	public void sleep() {
		
	}
	
	
	

}
