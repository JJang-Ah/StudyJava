package JavaThread;

public class PlayThread2 extends Thread{
	
	//interrupt > �Ͻ����� ������ �����忡�� ���ܸ� �߻���Ű�� ��
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("�뷡 �����");
				Thread.sleep(100);
			}
		}catch(InterruptedException e) { 
			//�Ͻ� ���� ���°� �־�� 
			//interruptedException�� �߻� �����ϴ�.
			
		}

		System.out.println("�ڿ�����");
		System.out.println("���� ����");
	}

}
