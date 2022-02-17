package JavaThread;

public class ThreadA extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
			}else {
				Thread.yield(); //Thread를 양보한다.
			}
		}
		System.out.println("ThradA 종료");
	}

}
