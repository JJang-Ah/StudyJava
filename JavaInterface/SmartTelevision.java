package JavaInterface;
//스마트TV (구현 클래스)
public class SmartTelevision implements RemoteControl, Searchable{

	private int volume;
	@Override
	public void search(String urㅣ) {
		System.out.println(urㅣ + "를 검색합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("스마트 TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if ( volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 스마트 TV 볼륨 : " + this.volume);
		
		
	}
	

}
