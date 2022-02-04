package javaObject;

public class cheomseongdaeEx1 {

	public static void main(String[] args) {

//		cheomseongdae cheom1 = new cheomseongdae(); //에러 난다. - 싱글톤이기 때문
		
		cheomseongdae user1=cheomseongdae.getInstance();
		cheomseongdae user2= cheomseongdae.getInstance();
		
		user1.funtion();
		
		if(user1==user2) {
			System.out.println("같은 첨성대 입니다.");
		}else {
			System.out.println("다른 첨성대 입니다.");
		}
	}

}
