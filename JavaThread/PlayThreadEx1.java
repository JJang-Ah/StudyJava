package JavaThread;

public class PlayThreadEx1 {

	public static void main(String[] args) {

		PlayThread pt = new PlayThread();
		pt.start();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		pt.setStop(true);
		
	}

}
