package JavaThread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit tk=Toolkit.getDefaultToolkit();
		for(int i=1; i<=5; i++) {
			tk.beep(); //������ �߻�
			try {
				Thread.sleep(500); //1000�� 1���̴�. > 500�� 0.5��
			}catch(Exception e) {
			}
		}
		
	}
	
	

	
	
	
}
