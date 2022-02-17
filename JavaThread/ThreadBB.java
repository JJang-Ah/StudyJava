package JavaThread;

public class ThreadBB extends Thread{
	private Work work;
	public ThreadBB(Work work) {
		this.work = work;
		
	}
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			work.methodB();
		}
	}

}
