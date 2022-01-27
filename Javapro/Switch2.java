package Javapro;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		System.out.print("점수를 입력하세요 >> ");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score<=100 && score>=0) {
			score/=10;
			switch(score) {
				case 10:
					System.out.println("헐~ 백점~ ");
				case 9:
					System.out.println("이야~ A등급이야");
					break;
				case 8:
					System.out.println("너는 B등급이다야");
					break;
				case 7:
					System.out.println("너는 C등급니다!");
					break;
				case 6:
				case 5:
				case 4,3,2,1,0:
					System.out.println("낙제다 이놈자슥아");
					break;	
				default:
					System.out.println("등급 에러 ;");
					break;
			}
		}else {
			System.out.println("잘좀 입력해봐 ;");
		}
	}
		

}
