package JavaThread;

public class AutoSaveEx1 {

	public static void main(String[] args) {

		AutoSaveThread autoThread = new AutoSaveThread();
		
		autoThread.setDaemon(true);
		autoThread.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("메인 쓰레드 종료");
	}

}
