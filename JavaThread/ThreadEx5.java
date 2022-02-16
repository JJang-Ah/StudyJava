package JavaThread;

public class ThreadEx5 {

	public static void main(String[] args) {

		Thread thread1 = Thread.currentThread(); //현재 수행중인 쓰레드
		System.out.println("프로그램 시작 쓰레드 : " + thread1.getName());
		
		Thread aa = new ThreadJobA();
		aa.start();
		
		ThreadJobA bb = new ThreadJobA();
		System.out.println("새로 만든 쓰레드 =>" + bb.getName()); 
		//.getName은 쓰레드 이름을 가져오는데 디폴드로 
		//순서에 따라 thread-0,thread-1,thread-2~~~ 이렇게 생성된다.
		//쓰레드 클래스에서 setName("~~") 으로 쓰레드 이름을 설정해 줄 수 있다.
		
		
		
		
		
		
		
	}

}
