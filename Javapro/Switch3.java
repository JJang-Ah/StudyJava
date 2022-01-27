package Javapro;

public class Switch3 {

	public static void main(String[] args) {
		char grade='B';
		switch(grade) {
			case 'a':
			case 'A': //이렇게 하면 소문자 대분자 상관없이 같은 실행문이 실행됨
				System.out.println("우수 회원입니다.");
				System.out.println("10% 할인을 받을 수 있습니다.");
				break;
			case 'b':	
			case 'B':
				System.out.println("일반 회원입니다.");
				System.out.println("5$ 할인을 받을 수 있습니다.");
				break;
			default:
				System.out.println("손님입니당.");
				break;
		}
		
	
	}

}


//반복문
//for, while, do while
//for(초기화식;조건식;증감식) {
//반복할 실행문;
//....
//}

