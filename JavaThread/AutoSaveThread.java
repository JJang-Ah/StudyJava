package JavaThread;

public class AutoSaveThread extends Thread {
	
	public void talk() {
		System.out.println("저장 완료 !!");
	}
	
	//메서드
	public void save() {
		talk();
		System.out.println("문서가 저장되었습니다.");
		
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}

}
