package JavaThread;

public class ThreadEx1 {

	public static void main(String[] args) {
		
		Runnable beep = new BeepTask();
		Thread thread = new Thread(beep);
		thread.start(); //���� ����ȴ�.
		
//		for(int i=1; i<=5; i++) {
//			tk.beep(); //������ �߻�
//			try {
//				Thread.sleep(500); //1000�� 1���̴�. > 500�� 0.5��
//			}catch(Exception e) {
//			}
//		}
		
		for(int i=1; i<=5; i++) {
			System.out.println("�Ӹ��� ��");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
			}
		}
	}
}
