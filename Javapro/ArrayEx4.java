package Javapro;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		//�ζ� ��ȣ �ڵ�����
		
		int lotto[]= new int[6];
		boolean run=true;
			int count=0;
		while(run) {
			System.out.println("Ȥ�� �����س� ���ڰ� �ֳ���? (������ 0�� �Է�)");
			Scanner sc=new Scanner(System.in);
			int num = sc.nextInt();
			if(num==0) {
				break; //while�� ������ �������´�.
			}else {
				lotto[count]=num;
				count++;
			}
			if(count==6) {
				break;
			}
		}
		
		while(run) {
			//6���� �ζǹ�ȣ ���� ����
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
		System.out.println(" *** �ζ� ��� ��ȣ *** ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
