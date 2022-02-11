package JavaException;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		try {
			String hello = null; //객체를 참조하고 있지 않다.
			System.out.println(hello.toString());
			
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("출력할 문자가 없습니다.");
		}

	
	//예외 처리 >> 오류가 발생하면 프로그램을 종료하지 않고 핸들링으로 처리하여 정상 실행 상태가 유지되도록 하는 기능
		
	}
}