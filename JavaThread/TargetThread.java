package JavaThread;

public class TargetThread extends Thread{
	//cpu가 쓰레드를 처리하고 있나~
	
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
