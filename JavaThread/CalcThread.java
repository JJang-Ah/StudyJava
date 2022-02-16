package JavaThread;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
	
	
	@Override
	public void run() {
		for(long i=0; i<10000000000L; i++) {		
		}
		System.out.println("작업완료 쓰레드 => " + getName());
	}
	
	
	
}
