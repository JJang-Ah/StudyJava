package Excercise;

public class Parent {
 // 7�� ��������
//	public String name;
//	
//	public Parent (String name) {
//		this.name = name;
//		
//	}
	
	public String nation;
	
	public Parent() {
		this("���ѹα�"); // >> �Ű������� �ϳ��ִ� �����ڸ� ȣ���Ѵ�.
		System.out.println("Parent() call");
		
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
		
	}
}
