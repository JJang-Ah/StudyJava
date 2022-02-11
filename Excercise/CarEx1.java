package Excercise;

public class CarEx1 {

	public static void main(String[] args) {

		//9장 연습문제
		
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire(); //외부 클래스 객체가 있어야지 인스턴스 클래스를 만들 수 있다.
		Car.Engine engine = new Car.Engine(); //정적 클래스이기 때문에 객체 생성없이 접근할 수 있다.
		
		
	}

}
