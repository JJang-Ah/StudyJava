package JavaThread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit tk=Toolkit.getDefaultToolkit();
		for(int i=1; i<=5; i++) {
			tk.beep(); //비프음 발생
			try {
				Thread.sleep(500); //1000이 1초이다. > 500은 0.5초
			}catch(Exception e) {
			}
		}
		
	}
	
	

	
	
	
}
