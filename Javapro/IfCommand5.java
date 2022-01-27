package Javapro;

import java.util.Scanner;

public class IfCommand5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("키를 입력해주세요 >> ");
		double key=sc.nextDouble();
		System.out.print("몸무게를 입력해주세요 >> ");
		double mom=sc.nextDouble();
		
		double pyojun;
		pyojun=(key-100)*0.9;
		
		if(mom<=(pyojun+5) && mom>=(pyojun-5)) {
			System.out.println("당신은 정상몸무게입니다! 이 상태를 유지하세요!");
		}else if(mom<=(pyojun-5)) {
			System.out.println("당신은 너무 말랐어요 영양소를 더 보충하세요!");
		}else if(mom>(pyojun+5)) {
			System.out.println("비만입니다! 식단관리와 운동을 해주세요!");
		}
		
		
		
	}

}
//
//
//비만도 체크 프로그램
////문제) 입력스캐너를 통해 키와 몸무게를 입력받아 비만도 체크 프로그램을 완성하시오
////표준몸무게=(자신의 키- 100)*0.9
//정상 표준몸무게의 +5 -5
//마른체형
//비만
//
//예) 키를 입력해주세요 >> 170
//몸무게를 입력해주세요 >> 62

