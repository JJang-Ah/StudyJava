package JavaThread;

public class ThreadEx5 {

	public static void main(String[] args) {

		Thread thread1 = Thread.currentThread(); //���� �������� ������
		System.out.println("���α׷� ���� ������ : " + thread1.getName());
		
		Thread aa = new ThreadJobA();
		aa.start();
		
		ThreadJobA bb = new ThreadJobA();
		System.out.println("���� ���� ������ =>" + bb.getName()); 
		//.getName�� ������ �̸��� �������µ� ������� 
		//������ ���� thread-0,thread-1,thread-2~~~ �̷��� �����ȴ�.
		//������ Ŭ�������� setName("~~") ���� ������ �̸��� ������ �� �� �ִ�.
		
		
		
		
		
		
		
	}

}
