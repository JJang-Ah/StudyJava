package JavaObject;

public class DriverEx1 {

	public static void main(String[] args) {


			Driver chulsu = new Driver();
			Bus bus = new Bus();
			Taxi taxi = new Taxi();
			chulsu.drive(bus);   // bus �������ִµ� ����Ǵ� ����? �ڵ�����ȯ 
			chulsu.drive(taxi);
		
	}

}
