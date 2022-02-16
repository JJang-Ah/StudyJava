package JavaThread;

import java.awt.Toolkit;

public class ThreadEx4 {

	public static void main(String[] args) {

		//아래 처럼 바로 새로운 쓰래드 만듦과 동시에 작동시킬 수 있다.
		new Thread() {
			@Override
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();
				for(int i=1; i<=5; i++) {
					tk.beep(); 
					try {
						Thread.sleep(500); 
					}catch(Exception e) {
					}
				}
			}
		}.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("띵호와");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
			}
		}
		
		
		
	}
}
