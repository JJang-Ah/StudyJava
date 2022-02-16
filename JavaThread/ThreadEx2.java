package JavaThread;

import java.awt.Toolkit;

public class ThreadEx2 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();
				for(int i=1; i<=5; i++) {
					tk.beep(); //������ �߻�
					try {
						Thread.sleep(500); //1000�� 1���̴�. > 500�� 0.5��
					}catch(Exception e) {
					}
				}
			}
		});
		
		thread.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("�Ӹ��� ��");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
			}
		}
		
	}

}
