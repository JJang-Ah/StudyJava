package Excercise;

public class AnonmousEx {

	public static void main(String[] args) {

		//9�� ��������
		
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle(){
			public void run() {
				System.out.println("������ Ʈ���� �޸��ϴ�.");
			}
		});
	}

}
