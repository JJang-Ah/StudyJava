package JavaObject;

public class RectangleEx1 {

	public static void main(String[] args) {

		int area;
		try {
			Rectangle rect1=new Rectangle(10, 20);
	//		System.out.println("사각형의 너비 : " + rect1.width); //필드에 정보가 감춰져잇어서 에러가 난다.
			
			rect1.setHeight(59);
			
			area=rect1.getArea();
			System.out.println("사각형의 넓ㅅ이 : " + area);
			System.out.println("사각형의 너비 : " + rect1.getWidth());
			System.out.println("사각형의 높이 : " + rect1.getHeight());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}



//캡슐화 >> private
//정보 은닉의 문제점 찾아보기
//해결 방안 제시 생각해보기