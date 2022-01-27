package Excercise;

import java.util.Scanner;

public class Ex3_4 {

	public static void main(String[] args) {
//		int value=356;
		Scanner sc=new Scanner(System.in);
		System.out.print("금액을 입력해주세영>>");
		
		int value=sc.nextInt();
		System.out.println(value-value%100);
		
	}

}
