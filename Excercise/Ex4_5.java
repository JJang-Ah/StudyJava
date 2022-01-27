package Excercise;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {

			boolean run=true;
			int balance=0;
			Scanner scanner=new Scanner(System.in);
			while(run) {
				System.out.println("--------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("------------------------------");
				System.out.print("선택 >> ");
				
				int choice = scanner.nextInt();
				
				switch (choice) {
				case 1:
					System.out.print("예금 얼마나 하실? : ");
					int plus = scanner.nextInt();
					balance += plus;
					System.out.println("현재 잔고는 : "+ balance +"원");
//					continue;
					break;
					
					
				case 2:
					System.out.print("출금 얼마나 하실? : ");
					int minus = scanner.nextInt();
					balance -= minus;
					System.out.println("현재 잔고는 : "+ balance +"원");
//					continue;
					break;
					

				case 3:
					
					System.out.println("현재 잔고는 : "+ balance +"원");
//					continue;
					break;
					

				case 4:
					System.out.println("프로그램이 종료 됩니다.");
					run = false;
					break;
				
				default:
					System.out.println("숫자 확인 해서 제대로 눌러주삼");
					break;
					
					
				}
					
				
			}
	
			System.out.println("프로그램끝");
	}
	
	

}
