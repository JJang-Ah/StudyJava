package JavaObject;

public class HyndaiCarEx {

	public static void main(String[] args) {

		HyundaiCar chulsuCar = new HyundaiCar(); //HyundaiCar 클래스의 인스턴스 객체 생성
		
		for(int i=1; i<=5; i++) {
			int problemLocation = chulsuCar.run();
			if(problemLocation != 0) {
				System.out.println(chulsuCar.tires[problemLocation-1].location +
						"한국 타이어로 교체");
				chulsuCar.tires[problemLocation-1]=new HankookTire(chulsuCar.tires[problemLocation-1].location,15);
			}
			
			
			
//			switch(problemLocation) {
//			case 1:
//				System.out.println("앞 왼쪽 한국타이어로 교체");
//				chulsuCar.frontLeftTire = new HankookTire("앞 왼쪽", 15);
//				break;
//			case 2:
//				System.out.println("앞 오른쪽 금호타이어로 교체");
//				chulsuCar.frontRightTire = new KumhoTire("앞 오른쪽", 7);
//				break;
//			case 3:
//				System.out.println("뒤 왼쪽 금호타이어로 교체");
//				chulsuCar.backLeftTire = new KumhoTire("뒤 왼쪽", 7);
//				break;
//			case 4:
//				System.out.println("뒤 오른쪽 한국타이어로 교체");
//				chulsuCar.backRightTire = new HankookTire("뒤 오른쪽", 15);
//				break;
//			}
			System.out.println("=====================================");
		}
	}

}
