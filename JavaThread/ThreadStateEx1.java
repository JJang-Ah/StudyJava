package JavaThread;

public class ThreadStateEx1 {

	public static void main(String[] args) {

		StatePrintThread spThread=new
				 StatePrintThread(new TargetThread());
		spThread.start();
	}

}
