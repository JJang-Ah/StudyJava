package JavaAPI;
import java.util.regex.Pattern;

public class PatternEx1 {

	public static void main(String[] args) {

		System.out.println("안녕하세요\n오늘은 화요일"); // \n : 줄바꿈 
		System.out.println("철수가 말했다 \"안녕\"이라고");

		
		//정규 표현식
		String data = "010-1234-1234";
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		// \d{a,b} : a~b자리의 숫자가 들어가야한다.
		System.out.println(regExp);
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result);
		if(result) {
			System.out.println("올바른 전화입니다.");
		}else {
			System.out.println("전화번호 형식이 틀립니다.");
		}
		
		String email = "gildong@naver.com";
		String eRegExp = "\\w+@\\w+\\.\\w+(\\.w+)?";
		boolean eresult = Pattern.matches(eRegExp, email);
		if(eresult) {
			System.out.println("올바른 이메일 형식입니다.");
		}else {
			System.out.println("이메일 형식이 틀립니다.");
		}
		
		
		
		
		
	}

}
