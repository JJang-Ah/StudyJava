package JavaObject;

public class Tiger extends Animal{ 
	//추상 클래스의 추상메소드가 본체가 없기때문 에러가난다.
// >>override 하라는 소리이다. 
	
	int age;
	
	@Override
	void move() {
		System.out.println("네발로 이동한다.");
		
	}

}
