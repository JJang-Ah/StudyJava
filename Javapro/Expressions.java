package Javapro;

import java.util.Scanner;

public class Expressions {

	public static void main(String[] args) {
		System.out.print("��� ������ �Է����ּ��� >>");
		Scanner sc=new Scanner(System.in); //sc +��Ʈ�� �����̽���
		int apple=sc.nextInt();
		System.out.print("��� ����ΰ���? >>");
		Scanner sp=new Scanner(System.in);
		
		int nums=sp.nextInt();
		//% �� ������ ���ϴ� �������̴�.
		System.out.println(5%2);
		
		int appleperChildren=apple/nums;
		int remain=apple%nums;
		System.out.println("�� ����� "+appleperChildren);
		System.out.println("���� ������ "+remain);
		
	
		
	}

}
