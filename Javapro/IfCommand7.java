package Javapro;

import java.util.Scanner;

public class IfCommand7 {

	public static void main(String[] args) {
//		��ø if�� >> if�� �ȿ� �� if�� �ֱ�
//		if(����) {
//			if(����) {
//				���๮
//				...
//			}
//		}else {
//			~~~
//		}
		System.out.print("������ �Է��ϼ��� >> ");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>100 || score<0) {
			System.out.println("���� �߸� �Է� �ص�");
			
		}else {
			
			if( score >= 90) {
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
		
		}
		// ���ǹ��� if �Ӹ��� �ƴϴ�. switch�� �ִ�~~!
		
		
	}

}
