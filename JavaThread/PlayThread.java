package JavaThread;

public class PlayThread extends Thread{
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("노래 무한 재생중");
			
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
		
	}

}
