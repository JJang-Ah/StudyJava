package Excercise;

public class Anonymous {
	
	//9�� ��������
	
	//Vehicle �������̽��� �ʵ� �ʱⰪ���� ����
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
	};
			
			
	// Vehicle �������̽��� �޼��� �ȿ� ���� ���������� ����
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
			}
			
		};
		localVar.run();
		
	}
	
	//�޼ҵ��� �Ű������� Vehicle �������̽��� �޴´�.
	void method2(Vehicle v) {
		v.run();
	}
	
	

}
