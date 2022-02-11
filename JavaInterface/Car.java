package JavaInterface;

public class Car {
	
//	Tire frontLeft = new HankookTire();
//	Tire frontRight = new HankookTire();
//	Tire backLeft = new HankookTire();
//	Tire backRight = new HankookTire();
	
	Tire[] tires = {
			new HankookTire(), new HankookTire()
			, new HankookTire(), new HankookTire()};
	
	
	
	void run() {
//		for(int i=0; i<tires.length; i++) {
//			tires[i].roll();
//		}
		for (Tire t:tires) {
			t.roll();
		}

	}

}
