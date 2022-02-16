package JavaThread;

public class ThreadEx1 {

	public static void main(String[] args) {
		
		Runnable beep = new BeepTask();
		Thread thread = new Thread(beep);
		thread.start(); //같이 실행된다.
		
//		for(int i=1; i<=5; i++) {
//			tk.beep(); //비프음 발생
//			try {
//				Thread.sleep(500); //1000이 1초이다. > 500은 0.5초
//			}catch(Exception e) {
//			}
//		}
		
		for(int i=1; i<=5; i++) {
			System.out.println("머리가 띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
			}
		}
	}
}
