package JavaThread;

public class User1 extends Thread{
	private Calcculator calc; //��ü �ʵ�

	public Calcculator getCalc() {
		return calc;
	}

	public void setCalc(Calcculator calc) {
		this.setName("User1");
		this.calc = calc;
	}
	
	@Override
	public void run() {
		calc.setMemory(100);
	}
	
	
}
