package JavaThread;

public class Work {

	
	//공유 작업 클래스
	
	
	public synchronized void methodA() {
		System.out.println("ThreadAA가 methodA 작업 실행");
		notify(); // 일시 정지 상태에있는 다른 스레드를 실행대기 상태
		try {
			wait(); //현재 내 스레드를 일시정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	public synchronized void methodB() {
		System.out.println("ThreadBB가 methodB 작업 실행");
		notify();
		try {
			wait(); //현재 내 스레드를 일시정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
