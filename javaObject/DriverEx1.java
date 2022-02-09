package JavaObject;

public class DriverEx1 {

	public static void main(String[] args) {


			Driver chulsu = new Driver();
			Bus bus = new Bus();
			Taxi taxi = new Taxi();
			chulsu.drive(bus);   // bus 전달해주는데 실행되는 이유? 자동형변환 
			chulsu.drive(taxi);
		
	}

}
