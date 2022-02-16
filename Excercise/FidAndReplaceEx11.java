package Excercise;

public class FidAndReplaceEx11 {

	public static void main(String[] args) {

		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str.indexOf("자바"); //자바란 값이 처음으로 발견된 위치값을 리턴받는다.
		if(index == -1) { //못찾으면 -1이 리턴된다.
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
			
		}else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str = str.replace("자바", "Java");
			System.out.println("->" + str);
		}
	}

}
