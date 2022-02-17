package JavaThread;

public class PlayThread2Ex1 {

	public static void main(String[] args) {

		Thread thread = new PlayThread2();
		thread.start();
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			
		}
		thread.interrupt();
	}

}
