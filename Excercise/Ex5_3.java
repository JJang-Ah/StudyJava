package Excercise;

import java.util.Scanner;

public class Ex5_3 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc=new Scanner(System.in);
		
		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			
			case 1:
				System.out.print("학생 수를 입력해 주세요 : ");
				studentNum=sc.nextInt();
				scores = new int[studentNum];
				continue;
			
			case 2:
				System.out.println("점수를 입력해 주세요 : ");
				for(int i =0; i<studentNum; i++) {
					System.out.print((i+1) + "번째 학생 점수 : ");
					scores[i]=sc.nextInt();
				}
				continue;
			
			case 3:
				System.out.println("점수 리스트 입니다.");
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
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				continue;
				
			case 5:
				run=false;
				System.out.println("프로그램이 종료 되었습니다.");
				break;
			}
		}
		
	}

}
