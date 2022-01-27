package Javapro;

import java.util.Scanner;

public class IfCommand7 {

	public static void main(String[] args) {
//		중첩 if문 >> if문 안에 또 if문 넣기
//		if(조건) {
//			if(조건) {
//				실행문
//				...
//			}
//		}else {
//			~~~
//		}
		System.out.print("점수를 입력하세요 >> ");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>100 || score<0) {
			System.out.println("점수 잘못 입력 해따");
			
		}else {
			
			if( score >= 90) {
				System.out.println("당신의 등급은 A등급");
			}else if(score>=80){
				System.out.println("당신의 등급은 B등급");
			}else if(score>=70){
				System.out.println("당신의 등급은 C등급");
			}else if(score>=60){
				System.out.println("당신의 등급은 D등급");
			}else {
				System.out.println("당신의 등급은 F등급");
			}		
		
		}
		// 조건문은 if 뿐만이 아니다. switch도 있다~~!
		
		
	}

}
