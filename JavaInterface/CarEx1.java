package JavaInterface;

public class CarEx1 {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		myCar.tires[0] = new KumhoTire();
		myCar.tires[3] = new KumhoTire();
		myCar.run();
		
	}

}
