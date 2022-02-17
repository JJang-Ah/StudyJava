package JavaThread;

public class ThreadB extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업 내용");
			}else {
				Thread.yield(); //Thread를 양보한다.
			}
		}
		System.out.println("ThradB 종료");
	}

}
