package JavaThread;

public class PlayThread extends Thread{
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("�뷡 ���� �����");
			
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
		
	}

}
