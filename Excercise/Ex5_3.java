package Excercise;

import java.util.Scanner;

public class Ex5_3 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc=new Scanner(System.in);
		
		while(run) {
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			
			case 1:
				System.out.print("�л� ���� �Է��� �ּ��� : ");
				studentNum=sc.nextInt();
				scores = new int[studentNum];
				continue;
			
			case 2:
				System.out.println("������ �Է��� �ּ��� : ");
				for(int i =0; i<studentNum; i++) {
					System.out.print((i+1) + "��° �л� ���� : ");
					scores[i]=sc.nextInt();
				}
				continue;
			
			case 3:
				System.out.println("���� ����Ʈ �Դϴ�.");
				for(int a : scores) {
					System.out.println(a);
				}
				continue;
			
			case 4:
				int max=0;
				double avg;
				int sum=0;
				for(int i=0; i<studentNum; i++) {
					sum+=scores[i];
					if(scores[i]>max) {
						max=scores[i];
					}
				}
				avg=(double) sum/studentNum;
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + avg);
				continue;
				
			case 5:
				run=false;
				System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
				break;
			}
		}
		
	}

}
