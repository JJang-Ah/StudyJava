package Javapro;

public class ForEx9 {

	public static void main(String[] args) {
////		for(int i=1; i<=10; i++) {
////			if(i%2 != 0) {
////				continue; //컨티뉴에 걸리면 for문 위로 다시 올라간다
////				
//				
////			}
//			System.out.println(i);
//		}
	
		
		//1부터 100까지의 합인데 5의 배수는 빼라
		
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			
			if(i%5 == 0) {
				continue;
				
			}
			sum+=i;
		}
		
		System.out.println(sum);

	}

}
