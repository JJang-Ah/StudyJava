package JavaObject;

public class abstractEx1 {

	public static void main(String[] args) {

		Tiger bibi =new Tiger();
		Eagle mimi = new Eagle();
		
		bibi.name="���";
		mimi.name="�̹�";
		bibi.age=2;
		System.out.println(bibi.name + "�� "+ bibi.age + "���Դϴ�.");
		bibi.move();
		
		
		mimi.home="����";
		System.out.println(mimi.name+"�� "+mimi.home+"�� ��ϴ�.");
		mimi.move();
				
	}

}
