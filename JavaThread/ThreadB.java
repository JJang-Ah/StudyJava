package JavaThread;

public class ThreadB extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾� ����");
			}else {
				Thread.yield(); //Thread�� �纸�Ѵ�.
			}
		}
		System.out.println("ThradB ����");
	}

}
