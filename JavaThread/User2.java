package JavaThread;

public class User2 extends Thread{
	private Calcculator calc;

	public Calcculator getCalc() {
		return calc;
	}

	public void setCalc(Calcculator calc) {
		this.setName("User2");
		this.calc = calc;
	}
	
	@Override
	public void run() {
		calc.setMemory(200);
	}
	

	
	
}
