package JavaThread;

public class ThreadA extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA �۾� ����");
			}else {
				Thread.yield(); //Thread�� �纸�Ѵ�.
			}
		}
		System.out.println("ThradA ����");
	}

}
