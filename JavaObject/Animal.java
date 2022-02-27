package JavaObject;

public abstract class Animal { 
	//추상을 뜻하는 abstract << 추상 클래스
	//인스턴스화를 금지하는 클래스
	
	//추상 메서드 << 추상 안에있는 메소드
	//1. 메소드 본체가 없다.
	//추상 메소드를 포함하는 클래스는 추상 클래스로 지정해야한다.
	
	String name;
	
	abstract void move();
	
}
