package Excercise;

import java.util.regex.Pattern;

public class PatternMatcherEx11 {

	public static void main(String[] args) {
		//11장 연습문제
		
		//첫 번째는 알파벳으로 시작하고 두번째부터 숫자와 알파벳으로 구성된 
		// 8~12자 사이의 id값인지 검사하기
		
		String id ="Angel1004";
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		}else {
			System.out.println("ID로 사용 못해요~~~!");
		}
	}

}
