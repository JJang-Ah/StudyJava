package JavaThread;

public class Work {

	
	//���� �۾� Ŭ����
	
	
	public synchronized void methodA() {
		System.out.println("ThreadAA�� methodA �۾� ����");
		notify(); // �Ͻ� ���� ���¿��ִ� �ٸ� �����带 ������ ����
		try {
			wait(); //���� �� �����带 �Ͻ�����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	public synchronized void methodB() {
		System.out.println("ThreadBB�� methodB �۾� ����");
		notify();
		try {
			wait(); //���� �� �����带 �Ͻ�����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
