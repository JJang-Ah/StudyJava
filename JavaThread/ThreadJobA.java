package JavaThread;

public class ThreadJobA extends Thread{
	
	public ThreadJobA() {
		setName("MoveJob"); //������ �̸��� MoveJob���� �������־���.
		//�ٸ� ���θ޼ҵ忡�� .getName() ���� �� �����带 �θ��� MoveJob�� ���ϵȴ�.
	}
	
	@Override
	public void run() {
		for(int i=1; i<=7; i++) {
		System.out.println("ThreadJobA�� ó���� ����");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
			}
		}
		
	}

}
