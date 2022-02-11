package JavaInterface;

public class Driver {

	public void drive(Vehicle vehicle) {
		
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.run();
			bus.checkFare();
		}else if ( vehicle instanceof Truck) {
			Truck truck = (Truck)vehicle;
			truck.run();
			truck.load();
		}
		
	}
	
}
