package JavaGeneric;

public class BoxEx1 {

	public static void main(String[] args) {
		
		
		//캐스팅 사용
		Box box = new Box(); //객체 생성
		box.set("대한민국");
		String nation = (String)box.get();
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		
		box.set(500);
		int num = (Integer)box.get();
		//=========================================================\
		
		//제네릭 사용
		Box<String> box2 = new Box<String>();
		box2.set("대한밍구기");
		String nation2 = box2.get();
		
		Box<Integer> box3 = new Box<Integer>();
		box3.set(500);
		int num2 = box3.get();
		
		
	}

}
