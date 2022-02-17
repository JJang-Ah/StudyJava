package JavaThread;
//TargetThread 상태를 출력
public class StatePrintThread extends Thread{
	private Thread tThread;
	
	public StatePrintThread(Thread tThread) {
		this.tThread = tThread;
	}
	
	
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = tThread.getState();
			//Thread의 상태를 얻어 올 수 있다.
			System.out.println("현재 쓰레드의 상태 : " + state);
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
