package JavaThread;

public class Calcculator {

	
	
	private int memory;
	
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		//synchronized >> 동기화. 공유 객체에서 쓰인다.
		//한 쓰레드가 끝날때까지 다른 쓰레드진행을 멈추게한다.
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) { //쓰레드가 종료될 때 발생하는 interrupt
			
		}
		System.out.println(Thread.currentThread().getName() + 
				"=>" + this.memory); //현재 처리되고있는 쓰레드 이름이 나오게된다.
		
	}
	
}
