package JavaInterface;

public class DriverEx1 {

	public static void main(String[] args) {

		Driver myDriver = new Driver();
		Bus bus = new Bus();
		Truck truck = new Truck();
		myDriver.drive(truck);
		myDriver.drive(bus);
		
		
	}

}
