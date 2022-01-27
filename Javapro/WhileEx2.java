package Javapro;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {

//		double num0=Math.abs(-5); //abs는 절대값 구하는 것
//		System.out.println(num0);
//		int num=(int)(Math.random()*6)+1; 
//		System.out.println(num);
//		
		
		
		int com=(int)(Math.random()*100)+1; //1~100까지 난수 하나 발생
		int my; //내가 입력하는 수
		int count=0; // 입력 횟수
		boolean game=true;
		
		Scanner sc = new Scanner (System.in);
		
		while(game) {
			System.out.print("1-100사이의 숫자를 넣어보세요 >> ");
			my=sc.nextInt();
			if(com>my && my>0) {
				System.out.println("당신의 숫자보다 큽니다. 더 큰 수 ㄱㄱ");
				count++;
				System.out.println("소진한 횟수 : " + count);
			}else if (com<my && my<100) {
				System.out.println("당신의 숫자보다 작아여~. 더 작은 수 ㄱㄱ" );
				count++;
				System.out.println("소진한 횟수 : " + count);

			}else if (com==my) {
				System.out.println("오 정답~~ 정답은 바로바로 ["+com+ "]였습니다.~");
				count++;
				System.out.println(count + "번 만에 성공~~~");
				game=false;
				
			}else {
				System.out.println("숫자 제대로 넣어라 ;;");
			}
			
			
		}
		System.out.println("게임끝");
	}

}


//while(조건식){
//실행문;
//....
//}


//주의할점! : 무한루프가 돌 수 있다. 그러면 안된다
