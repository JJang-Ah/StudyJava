package JavaGeneric;

public class BoxEx1 {

	public static void main(String[] args) {
		
		
		//ĳ���� ���
		Box box = new Box(); //��ü ����
		box.set("���ѹα�");
		String nation = (String)box.get();
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		
		box.set(500);
		int num = (Integer)box.get();
		//=========================================================\
		
		//���׸� ���
		Box<String> box2 = new Box<String>();
		box2.set("���ѹֱ���");
		String nation2 = box2.get();
		
		Box<Integer> box3 = new Box<Integer>();
		box3.set(500);
		int num2 = box3.get();
		
		
	}

}
