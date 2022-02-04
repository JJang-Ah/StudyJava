package javaObject;

public class cheomseongdae {
	private static cheomseongdae cheom = new cheomseongdae(); 
	//캡슐화 할때 private 쓴다.
	private cheomseongdae() {	
	}
	
	public static void funtion() {
		System.out.println("신라시대의 천문 관측소");
	}
	
	public static cheomseongdae getInstance() {
		
		return cheom;
	}
		
		
	

}
