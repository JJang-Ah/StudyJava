package JavaThread;

public class AutoSaveThread extends Thread {
	
	public void talk() {
		System.out.println("���� �Ϸ� !!");
	}
	
	//�޼���
	public void save() {
		talk();
		System.out.println("������ ����Ǿ����ϴ�.");
		
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
