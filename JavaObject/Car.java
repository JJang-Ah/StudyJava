package JavaObject;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	//생성자
	public Car() {
		this("자가용","은색",220); //this () 다른 생성자를 호출할 수있다
	}
	
	public Car(String model) {
		this(model, "은색", 220);
		
	}
	public Car(String model, String color) {
		this.model=model;
		this.color=color;
		this.maxSpeed=220;
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	
}
