package JavaThread;

public class JoinEx1 {

	public static void main(String[] args) {

		SumThread st = new SumThread();
		st.start();
		try {
			st.join(); //st가 끝날때까지 다른 쓰레드는 정지 메인도 정지
		} catch (InterruptedException e) {
		}
		System.out.println("1부터 100까지의 합 = " + st.getSum());
		
	}

}
