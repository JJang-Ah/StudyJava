package JavaInterface;

public class VehicleEx1 {

	public static void main(String[] args) {

		Vehicle vehicle = new Bus(); //클래스 뿐만 아니라 인터페이스도 다형성이있다.
		vehicle.run();
//		vehicle.checkFare(); //이건 안된다. 선언을 vehicle로 햇기때문
		
		//자식 > 부모 자동 형변환이 되지만
		// 부모 > 자식 강제형변환 해야한다
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
		
	}

}
