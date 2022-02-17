package JavaThread;
//TargetThread ���¸� ���
public class StatePrintThread extends Thread{
	private Thread tThread;
	
	public StatePrintThread(Thread tThread) {
		this.tThread = tThread;
	}
	
	
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = tThread.getState();
			//Thread�� ���¸� ��� �� �� �ִ�.
			System.out.println("���� �������� ���� : " + state);
			if(state == Thread.State.NEW) {
				tThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				
			}
		}
	}

	
	
}
