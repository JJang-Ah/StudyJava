package Javapro;

public class ForEx7 {

	public static void main(String[] args) {

		//문제) 탐험가가 보물섬을 찾기 위해 지도 항해~~
		//!! 보물섭 발견~! -동굴발견 - 금2kg짜리가 30개!! 그건 빙산의 일각 3kg 짜리가 30개!! 
		// 하지만... 배에 적재가능한 무게는 100kg.. 탐험가의 몸무게는 70kg 이나 된다야 아후 진작에 살좀빼지
		//2kg 짜리는 몇개 3kg 짜리는 몇개 실을수 있는지 모든 경우의 수를 구해보자
		int i;
		int j;
		for(i=0;i<=30;i++) {
			for(j=0;j<=30;j++) {
				if((i*2+j*3)==30) {
					System.out.println("================");
					System.out.print("2kg 짜리 "+i + "개, ");
					System.out.println("3kg 짜리 "+j + "개");
					System.out.println("================");

				}
				
			}
		}
	}

}
