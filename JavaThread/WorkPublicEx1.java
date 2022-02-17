package JavaThread;

public class WorkPublicEx1 {

	public static void main(String[] args) {

		Work work = new Work(); //공유 객체 생성
		
		ThreadAA taa = new ThreadAA(work);
		ThreadBB tbb = new ThreadBB(work);
		
		taa.start();
		tbb.start();
		
		
		
		
	}

}
