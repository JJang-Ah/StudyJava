package JavaThread;

public class WorkPublicEx1 {

	public static void main(String[] args) {

		Work work = new Work(); //���� ��ü ����
		
		ThreadAA taa = new ThreadAA(work);
		ThreadBB tbb = new ThreadBB(work);
		
		taa.start();
		tbb.start();
		
		
		
		
	}

}
