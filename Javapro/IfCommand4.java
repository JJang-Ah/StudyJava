package Javapro;

import java.util.Scanner;

public class IfCommand4 {

	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ��� >> ");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>100) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else if( score >= 90) {
			System.out.println("����� ����� A���");
		}else if(score>=80){
			System.out.println("����� ����� B���");
		}else if(score>=70){
			System.out.println("����� ����� C���");
		}else if(score>=60){
			System.out.println("����� ����� D���");
		}else {
			System.out.println("����� ����� F���");
		}		
					
		
				
// 	����) ������ �Է¹޾� ����� ó���ϴ� ���α׷��� �ϼ��Ͻÿ�
//				90~100 ��� A
//				80~89		B
//				70~79	C
//				60~69	D
//				59�� ���� F
//		
	}

}
