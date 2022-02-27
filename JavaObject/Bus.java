package JavaObject;

public class Bus extends Vehicle{

	@Override           // annotation
	public void run() { // override -> 메서드 재정의(vehicle에 있는 메서드임)
		System.out.println("버스가 달립니다."); 
		
	}

}
