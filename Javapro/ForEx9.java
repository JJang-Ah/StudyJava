package Javapro;

public class ForEx9 {

	public static void main(String[] args) {
////		for(int i=1; i<=10; i++) {
////			if(i%2 != 0) {
////				continue; //��Ƽ���� �ɸ��� for�� ���� �ٽ� �ö󰣴�
////				
//				
////			}
//			System.out.println(i);
//		}
	
		
		//1���� 100������ ���ε� 5�� ����� ����
		
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
