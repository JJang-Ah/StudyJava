package javaObject;

public class cheomseongdaeEx1 {

	public static void main(String[] args) {

//		cheomseongdae cheom1 = new cheomseongdae(); //���� ����. - �̱����̱� ����
		
		cheomseongdae user1=cheomseongdae.getInstance();
		cheomseongdae user2= cheomseongdae.getInstance();
		
		user1.funtion();
		
		if(user1==user2) {
			System.out.println("���� ÷���� �Դϴ�.");
		}else {
			System.out.println("�ٸ� ÷���� �Դϴ�.");
		}
	}

}
