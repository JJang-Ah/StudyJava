package JavaThread;

public class PriorityEx1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			Thread thread = new CalcThread("jobProcess" + i);
			if(i==10) {
				thread.setPriority(Thread.MAX_PRIORITY);
			}else {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			
			thread.start();
		}

	}

}
