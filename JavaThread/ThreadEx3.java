package JavaThread;

public class ThreadEx3 {

	public static void main(String[] args) {

		Thread thread = new WorkerThread();
		thread.start();

		for(int i=1; i<=5; i++) {
			System.out.println("¸Ó¸®°¡ ¶ò");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
			}
		}
	}

}
