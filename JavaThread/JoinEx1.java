package JavaThread;

public class JoinEx1 {

	public static void main(String[] args) {

		SumThread st = new SumThread();
		st.start();
		try {
			st.join(); //st�� ���������� �ٸ� ������� ���� ���ε� ����
		} catch (InterruptedException e) {
		}
		System.out.println("1���� 100������ �� = " + st.getSum());
		
	}

}
