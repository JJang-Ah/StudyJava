package Excercise;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {

			boolean run=true;
			int balance=0;
			Scanner scanner=new Scanner(System.in);
			while(run) {
				System.out.println("--------------------------");
				System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
				System.out.println("------------------------------");
				System.out.print("���� >> ");
				
				int choice = scanner.nextInt();
				
				switch (choice) {
				case 1:
					System.out.print("���� �󸶳� �Ͻ�? : ");
					int plus = scanner.nextInt();
					balance += plus;
					System.out.println("���� �ܰ�� : "+ balance +"��");
//					continue;
					break;
					
					
				case 2:
					System.out.print("��� �󸶳� �Ͻ�? : ");
					int minus = scanner.nextInt();
					balance -= minus;
					System.out.println("���� �ܰ�� : "+ balance +"��");
//					continue;
					break;
					

				case 3:
					
					System.out.println("���� �ܰ�� : "+ balance +"��");
//					continue;
					break;
					

				case 4:
					System.out.println("���α׷��� ���� �˴ϴ�.");
					run = false;
					break;
				
				default:
					System.out.println("���� Ȯ�� �ؼ� ����� �����ֻ�");
					break;
					
					
				}
					
				
			}
	
			System.out.println("���α׷���");
	}
	
	

}
