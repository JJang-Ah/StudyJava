package JavaThread;

public class TargetThread extends Thread{
	//cpu�� �����带 ó���ϰ� �ֳ�~
	
	@Override
	public void run() {
		for(long i=0; i<=1000000000; i++) {
			
		}
		try {
		Thread.sleep(2000);
		}catch (Exception e ) {
		}
		
		for(long i=0; i<=1000000000; i++) {	
		}
	}

}
