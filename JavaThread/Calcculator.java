package JavaThread;

public class Calcculator {

	
	
	private int memory;
	
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		//synchronized >> ����ȭ. ���� ��ü���� ���δ�.
		//�� �����尡 ���������� �ٸ� ������������ ���߰��Ѵ�.
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) { //�����尡 ����� �� �߻��ϴ� interrupt
			
		}
		System.out.println(Thread.currentThread().getName() + 
				"=>" + this.memory); //���� ó���ǰ��ִ� ������ �̸��� �����Եȴ�.
		
	}
	
}
