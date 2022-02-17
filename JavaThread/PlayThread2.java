package JavaThread;

public class PlayThread2 extends Thread{
	
	//interrupt > 일시정지 상태의 스레드에서 예외를 발생시키는 것
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("노래 재생중");
				Thread.sleep(100);
			}
		}catch(InterruptedException e) { 
			//일시 정지 상태가 있어야 
			//interruptedException이 발생 가능하다.
			
		}

		System.out.println("자원정리");
		System.out.println("실행 종료");
	}

}
