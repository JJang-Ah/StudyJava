package JavaAPI;

import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {

		//문제 주민번호 자리수 판단하는 프로그램
		//주민번호 입력 >> 981212-1234567
		//주민번호 자리수가 맞습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력 > ");
		String ssn = sc.next();
		System.out.println();
		if(ssn.length()==14) {
			System.out.println("주민 번호 자리수가 맞습니다.");
		}else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
		
		
		
		
		
		
	}

}
