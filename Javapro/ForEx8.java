package Javapro;

public class ForEx8 {

	public static void main(String[] args) {
		Outter: for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j>3) {
					break Outter;
				}
				System.out.println(i + " , " + j );
				
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
