package Javapro;

public class ArrayEx11 {

	public static void main(String[] args) {
		//지금까지 했던거는 1차원 배열
		// 이제 다차원배열 ㄱㄱ
//		int[][] scores=new int[2][3]; //
		
//		scores[0][1]=30;
//		scores[0][0]=20;
//		scores[0][2]=50;
//		scores[1][0]=45;
//		scores[1][1]=70;
//		scores[1][2]=50;
//		
		
		int[][] scores= {{20,30,40},{45,64,74}};
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		
		}
		
		
	}

}
