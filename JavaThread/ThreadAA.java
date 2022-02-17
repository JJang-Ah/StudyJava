package JavaThread;

public class ThreadAA extends Thread{
	private Work work;
	public ThreadAA(Work work) {
		this.work = work;
		
	}
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			work.methodA();
		}
	}

}
