package JavaAPI;

import java.util.Scanner;

public class ArraysEx3 {

	public static void main(String[] args) {

		int[] scores = {80,78,56,97,81};
		String[] names = {"박찬호","홍길동","김철수","고영희","고길동"};
		int searchScore = 97;
		Scanner sc = new Scanner(System.in);
		System.out.print(" 이름을 입력하세요 > ");
		String searchname = sc.next();
		
		int i;
		for(i=0;i<scores.length;i++) {
			if(names[i].equals(searchname)) {
				System.out.println("당신의 점수는 : " + scores[i]);
				break;
			}	
		}
		if(i==scores.length) {
				System.out.println("명단에 해당하는 이름이 없습니다.");
			}
		
	}

}
