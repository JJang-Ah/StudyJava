package javaObject;

public class cheomseongdae {
	private static cheomseongdae cheom = new cheomseongdae(); 
	//ĸ��ȭ �Ҷ� private ����.
	private cheomseongdae() {	
	}
	
	public static void funtion() {
		System.out.println("�Ŷ�ô��� õ�� ������");
	}
	
	public static cheomseongdae getInstance() {
		
		return cheom;
	}
		
		
	

}
