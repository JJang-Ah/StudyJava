package Javapro;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		System.out.print("������ �Է��ϼ��� >> ");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score<=100 && score>=0) {
			score/=10;
			switch(score) {
				case 10:
					System.out.println("��~ ����~ ");
				case 9:
					System.out.println("�̾�~ A����̾�");
					break;
				case 8:
					System.out.println("�ʴ� B����̴پ�");
					break;
				case 7:
					System.out.println("�ʴ� C��޴ϴ�!");
					break;
				case 6:
				case 5:
				case 4,3,2,1,0:
					System.out.println("������ �̳��ڽ���");
					break;	
				default:
					System.out.println("��� ���� ;");
					break;
			}
		}else {
			System.out.println("���� �Է��غ� ;");
		}
	}
		

}
