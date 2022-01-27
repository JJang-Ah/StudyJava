package Javapro;

public class WhileEx3 {

	public static void main(String[] args) {
//	    int i=0;
//		while(true) {
//			int num=(int)(Math.random()*6)+1;
//			System.out.println(num);
//			i+=1;
//			if(num==6) {
//				System.out.println(i+"번 만에 성공");
//				break;
//				
//			}
//		}
	
		System.out.println("이번주 로또 번호는~~~");
		int lotto;
		for(int i=1; i<=6; i++) {
			lotto=(int)(Math.random()*45)+1;
			System.out.println(lotto);
			
			
		}
	}

}
