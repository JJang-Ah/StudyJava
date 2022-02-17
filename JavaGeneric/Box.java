package JavaGeneric;

public class Box<T>  {
	// <T>는 아무 타입이나 받겠다는 뜻
	// <>에 아무거나 넣어도 된다.` 그냥 T로 해본거다
	private T type; 
	//Object는 모든 객체를 담을 수있다
	
	public void set(T type) {
		this.type = type;
		
	}
	public T get() {
		return type;
		
	}
	
	
}


