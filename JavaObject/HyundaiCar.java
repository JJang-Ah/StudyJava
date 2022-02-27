package JavaObject;

public class HyundaiCar {
//	
//	Tire frontLeftTire = new HankookTire("앞 왼쪽", 6);
//	Tire frontRightTire = new HankookTire("앞 오른쪽", 2);
//	Tire backLeftTire = new KumhoTire("뒤 왼쪽", 3);
//	Tire backRightTire = new KumhoTire("뒤 오른쪽", 5);
	//위 코드들을 배열로 만들기
	Tire[] tires = {
			new Tire("앞 왼쪽", 2),
			new Tire("앞 오른쪽", 3),
			new Tire("뒤 왼쪽", 4),
			new Tire("뒤 오른쪽", 6),
			};
	
	
	//메소드
	int run() {
		System.out.println("자동차가 부릉부릉");
		for( int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i+1);
				}
			}
		return 0;
		}
	
//		if(frontLeftTire.roll() == false) {
//			System.out.println("앞 왼쪽 바퀴가 펑펑");
//			stop();
//			return 1; //타이어의 번호
//		}
//		if(frontRightTire.roll() == false) {
//			System.out.println("앞 오른쪽 바퀴가 펑펑");
//			stop();
//			return 2; //타이어의 번호
//		}
//		if(backLeftTire.roll() == false) {
//			System.out.println("뒤 왼쪽 바퀴가 펑펑");
//			stop();
//			return 3; //타이어의 번호
//		}
//		if(backRightTire.roll() == false) {
//			System.out.println("뒤 오른족 바퀴가 펑펑");
//			stop();
//			return 4; //타이어의 번호
//		}
//		return 0;
		 
		// 위 코드를 아래로 만들 수 있다.
		
	
	void stop() {
		System.out.println("자동차가 멈춘다!!");
		
		
	}
}
