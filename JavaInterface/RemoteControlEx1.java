package JavaInterface;

public class RemoteControlEx1 {

	public static void main(String[] args) {

//		Television sstv = new Television();
//		sstv.turnOn();
//		sstv.setVolume(5);
//		sstv.turnOff();

		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setMute(false);
		rc.setVolume(5);
		rc.turnOff();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();
		RemoteControl.changeBattery();// °´Ã¼ »ý¼º¾øÀÌ  
		RemoteControl rc1 = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("???¸¦ ÄÕ´Ï´Ù.");
				
			}
			
			@Override
			public void turnOff() {
				
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		
		SmartTelevision st = new SmartTelevision();
		st.turnOn();
		st.search("www.naver.com");
		st.setVolume(4);
		st.turnOff();
		
				
	}

}
