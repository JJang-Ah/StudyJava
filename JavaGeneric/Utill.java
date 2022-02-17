package JavaGeneric;

public class Utill {

	
	//리턴 타입으로 제레릭을 받는게
	//제네릭 메소드다
	
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
