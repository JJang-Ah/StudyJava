package JavaInterface;
//리모콘 인터페이스
public interface RemoteControl {
	
	// 인터페이스에서 필드는 선언 불가능 하지만
	// 상수 필드는 선언 가능
	public int MAX_VOLUME = 10; //인터페이스에서의 상수는 static final로 인식
	public int MIN_VOLUME = 0;
	
	//추상 메소드
	public void turnOn(); //인터페이스 파일에서는 앞에 abstract 안써도 된다. 
	public void turnOff(); // 저절로 추상 메소드로 인식해 주기 때문이다.
	public void setVolume(int volume);
	
	//디폴트 메소드 // 자바8 부터 생긴 기능
	default void setMute (boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제");
		}
	}
	
	//정적 메소드 // 자바8 부터 생긴 기능
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	
}
