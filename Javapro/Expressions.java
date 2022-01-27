package Javapro;

import java.util.Scanner;

public class Expressions {

	public static void main(String[] args) {
		System.out.print("사과 개수를 입력해주세요 >>");
		Scanner sc=new Scanner(System.in); //sc +컨트롤 스페이스바
		int apple=sc.nextInt();
		System.out.print("사람 몇명인가여? >>");
		Scanner sp=new Scanner(System.in);
		
		int nums=sp.nextInt();
		//% 는 나머지 구하는 연산자이다.
		System.out.println(5%2);
		
		int appleperChildren=apple/nums;
		int remain=apple%nums;
		System.out.println("한 사람당 "+appleperChildren);
		System.out.println("남는 개수는 "+remain);
		
	
		
	}

}
