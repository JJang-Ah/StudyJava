package JavaException;

public class ExceptionEx3 {

	public static void main(String[] args) {
	
		
		String str1 = "100";
		String str2 = "200";
		System.out.println(str1+str2);
		System.out.println(Integer.parseInt(str1) +Integer.parseInt(str2));
		//Intiger.parsInt >> 숫자 문자열을 정수값으로 인식하게 해준다.
		
		String str3 = "올100";
		String str4 = "200";
		try {
			System.out.println(Integer.parseInt(str3) +Integer.parseInt(str4));
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("숫자로 변환 불가여~");
		}finally { //finally는 에러가 잇든 없든 항상 실행
			System.out.println("마무리~~!");
		}
		
		
	}

}
