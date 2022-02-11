package Excercise;

public class Anonymous {
	
	//9장 연습문제
	
	//Vehicle 인터페이스를 필드 초기값으로 대입
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
			
			
	// Vehicle 인터페이스를 메서드 안에 로컬 변수값으로 대입
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
			
		};
		localVar.run();
		
	}
	
	//메소드의 매개변수로 Vehicle 인터페이스를 받는다.
	void method2(Vehicle v) {
		v.run();
	}
	
	

}
