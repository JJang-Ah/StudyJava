package JavaThread;

import java.awt.Toolkit;

public class ThreadEx4 {

	public static void main(String[] args) {

		//�Ʒ� ó�� �ٷ� ���ο� ������ ����� ���ÿ� �۵���ų �� �ִ�.
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
			System.out.println("��ȣ��");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
			}
		}
		
		
		
	}
}
