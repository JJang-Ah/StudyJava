package Excercise;

public class Child extends Parent{
	//7�� ��������

//	private int studentNo;
//	
//	public Child(String name, int studentNo) {
////		this.name = name; //�̷��� �ϸ� ������ ����.
//		super(name);
//		this.studentNo = studentNo;
//		
//	}
	
	
	
	private String name;
	public Child() {
		this("ȫ�浿"); // this.~ > �ϳ��� �� ȣ�� /this(~) > ~�� ������ŭ�� �Ű������� ���� ������ ȣ��
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
