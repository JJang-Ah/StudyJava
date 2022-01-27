package Javapro;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
//		조건문 
//		switch(변수)
//		 case 값: // 변수에 있는값이 맞는 case 값이 가지는 실행문을 따르고 나오게된다.
//		  실행문;
//		  break;
//		 case 값:
//		  실행문;
//		  break;
//		 case 값:
//		  실행문;
//		  break;
//		 case 값:
//		  실행문;
//		  break;
//		 default:
//			 실행문; // case 아무곳에도 걸리지 않는다면 default를 실행한다.
//			
		
		System.out.print("여행지를 번호르 선택하세요~(1.미주 2.유럽 3.동남아)>> ");
		Scanner sc= new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1: //break가 없으면 ex 1을 입력하면 case 1,2,3, default 실행문이 전부 실행된다.
			System.out.println("1층 안내데스크로 가보세요");
			break;
		case 2:
			System.out.println("2층 안내데스크로 가보세요");
			break;
		case 3:
			System.out.println("별관 안내데스크로 가보세요");
			break;
		default:
			System.out.println("여행지 선택이 잘못되었습니다.");
			break;
			
		}
		
		System.out.println("해피 트립 되세요~");
		
		
	}

}
