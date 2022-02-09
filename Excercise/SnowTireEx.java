package Excercise;

public class SnowTireEx {

	public static void main(String[] args) {

		//7장 연습문제
		
		SnowTire snowTire = new SnowTire(); //객체 생성 (인스턴스화)
		Tire tire = snowTire; //이걸 다형성 이라고 한다. //부모한테 자식이 들어가서 자동형변환이 되었다
		
		tire.run();
		snowTire.run();
		
	}

}
