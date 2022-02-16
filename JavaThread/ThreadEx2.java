package JavaThread;

import java.awt.Toolkit;

public class ThreadEx2 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();
				for(int i=1; i<=5; i++) {
					tk.beep(); //비프음 발생
					try {
						Thread.sleep(500); //1000이 1초이다. > 500은 0.5초
					}catch(Exception e) {
					}
				}
			}
		});
		
		thread.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("머리가 띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
			}
		}
		
	}

}
