package Excercise;

import java.util.Scanner;

public class Ex3_4 {

	public static void main(String[] args) {
//		int value=356;
		Scanner sc=new Scanner(System.in);
		System.out.print("�ݾ��� �Է����ּ���>>");
		
		int value=sc.nextInt();
		System.out.println(value-value%100);
		
	}

}
