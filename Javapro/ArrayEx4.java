package Javapro;

public class ArrayEx4 {

	public static void main(String[] args) {
		//로또 번호 자동생성
		
		int lotto[]= new int[6];
		boolean run=true;
		while(run) {
			//6개의 로또번호 숫자 생성
			for(int i=1;i<lotto.length;i++) {
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
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

}
