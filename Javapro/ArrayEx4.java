package Javapro;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		//로또 번호 자동생성
		
		int lotto[]= new int[6];
		boolean run=true;
			int count=0;
		while(run) {
			System.out.println("혹시 생각해논 숫자가 있나용? (없으면 0을 입력)");
			Scanner sc=new Scanner(System.in);
			int num = sc.nextInt();
			if(num==0) {
				break; //while문 밑으로 빠져나온다.
			}else {
				lotto[count]=num;
				count++;
			}
			if(count==6) {
				break;
			}
		}
		
		while(run) {
			//6개의 로또번호 숫자 생성
			for(int i=count;i<lotto.length;i++) {
				lotto[i]=(int)(Math.random()*45)+1;
			}
			
			run=false;
			Outter:	for(int a=0; a<lotto.length;a++) {
						for(int b=a+1; b<lotto.length; b++) {
							if(lotto[a]==lotto[b]) {
								run=true;
								break Outter;
							
							}
						}
					}
		}
		System.out.println(" *** 로또 행운 번호 *** ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
