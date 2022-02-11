package JavaInterface;
//����ƮTV (���� Ŭ����)
public class SmartTelevision implements RemoteControl, Searchable{

	private int volume;
	@Override
	public void search(String ur��) {
		System.out.println(ur�� + "�� �˻��մϴ�.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("����Ʈ TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("����Ʈ TV�� ���ϴ�.");
		
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
		System.out.println("���� ����Ʈ TV ���� : " + this.volume);
		
		
	}
	

}
