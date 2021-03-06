package JavaInterface;

public class Audio implements RemoteControl {

	// source 메뉴에서 override 하는 메소드를 고를수 있는 탭이있다.
	//필드
	
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
		
		
	}
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if (mute) {
			System.out.println("Audio를 무음 처리합니다.");	
		}else {
			System.out.println("Audio 무음 처리가 해제되었습니다.");
		}
	}

}
