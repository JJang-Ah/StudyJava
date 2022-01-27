package Javapro;

public class IfCmd {

	public static void main(String[] args) {
		//제어문
		//1. 조건문 
		// if(조건식) 실행문;
		// 
		int score=65;
		if(score>=80) System.out.println("합격하셨습니다.");
		System.out.println("수고햐셨습니다.");
		//if(조건식) {  >> 실행문이 여러개일때는 블록만들어서 해준다
		// 실행문;
		// 실행문;
		// ...
		if (score>=80) { 
			System.out.println("합격이오");
			System.out.println("내일 오전 10시까지 오십시오.");
			
		}
		else {
			System.out.println("허허허 탈락일세 썩 나가주시게");
			
		}
			
			

	}

}
