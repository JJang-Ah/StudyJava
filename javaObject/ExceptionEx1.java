package JavaObject;

public class ExceptionEx1 {

	public static void main(String[] args) {

		int num1=10;
		int num2=0;
		try {
		int result=num1/num2;
			System.out.println("��� ��� : " + result);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.getMessage();
			
		}
	}

}
