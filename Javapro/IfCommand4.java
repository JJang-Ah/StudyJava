package Javapro;

import java.util.Scanner;

public class IfCommand4 {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요 >> ");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>100) {
			System.out.println("잘못 입력하셨습니다.");
		}else if( score >= 90) {
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
					
		
				
// 	문제) 점수를 입력받아 등급을 처리하는 프로그램을 완성하시오
//				90~100 등급 A
//				80~89		B
//				70~79	C
//				60~69	D
//				59점 이하 F
//		
	}

}
