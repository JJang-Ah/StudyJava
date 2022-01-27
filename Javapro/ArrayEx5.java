package Javapro;

public class ArrayEx5 {

	public static void main(String[] args) {

		int ages[]= {35,23,65,42,64,58,24,67,31,54,68};
		int sales[] = {23000,75000,65000,30000,56000,79000,64000,66000,78000,41000,64000};
		//20대 고객들의 매출총액 구하시오.
		//20대 고객 매출총액?
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		int sum=0;
//		for(int i=0;i<ages.length;i++) {
//			switch (ages[i]/10) {
//			case 2:
//				sum+=sales[i];
//				continue;
//				
//			default:
//				continue;
//				
//			}
//		}
//		System.out.println("20대 매출 총액 : " + sum);
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ여기까지 내가한거ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		
//		int sum=0;
//		for(int i=0; i<ages.length; i++) {
//			if(ages[i]/10==2) {
//				sum+=sales[i];
//			}
//		}
//		System.out.println("20대 매출 총액 : " + sum);
		
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ여기는 선생님이 해주신거 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		
		int sum[]= new int[9];
		int j;
		for(int i=0; i<ages.length; i++) {
			for(j=0;j<sum.length;j++) {
				if(ages[i]/10==j) {
					sum[j]+=sales[i];			
				}
			}
		}
		for(j=0;j<sum.length;j++) {
			System.out.println(j+"0대 매출 총액 : "+ sum[j]);
		}
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ이건 내가 응용한거ㅡㅡㅡㅡㅡㅡ역시 나는 천재....? ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	}

}
