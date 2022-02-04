package javaObject;

public class CarEx2 {

	public static void main(String[] args) {

		Car chulsuCar = new Car();
		printCar(chulsuCar);
		Car younheeCar = new Car("택시");
		printCar(younheeCar);
	}
	
	
	
	
	
	//자동차 정보 출력 메서드
	//static < 정적이다라는 의미
	static void printCar(Car obj) {
		System.out.println("company : " + obj.company);
		System.out.println("model : " + obj.model);
		System.out.println("color : " + obj.color);
		System.out.println("maxSpeed : " + obj.maxSpeed);
		System.out.println("===============================");
		
	}

}
