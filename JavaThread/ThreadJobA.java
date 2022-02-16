package JavaThread;

public class ThreadJobA extends Thread{
	
	public ThreadJobA() {
		setName("MoveJob"); //쓰레드 이름을 MoveJob으로 세팅해주었다.
		//다른 메인메소드에서 .getName() 으로 이 쓰레드를 부르면 MoveJob이 리턴된다.
	}
	
	@Override
	public void run() {
		for(int i=1; i<=7; i++) {
		System.out.println("ThreadJobA가 처리한 내용");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
			}
		}
		
	}

}
