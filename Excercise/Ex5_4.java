package Excercise;

public class Ex5_4 {

	public static void main(String[] args) {

		//마방진 (MAGIC square) 3*3 5*5 7*7 홀수형은 다된다.
		
		// 가로로 더하든 세로로 더하든 대각선으로 더하든 다 같은 수가 나온다.
		
		//1. 첫행의 중간 열에 1을 넣는다.
		//2. 값을 입력한 후 대각선 위로 이동합니다.( ↗ )
		//3. 행이 존재하지 않을 경우
		// ==>마지막 행에 다음 숫자 값을 넣는다.
		//4. 열이 존재하지 않는 경우
		// ==>첫열에 다음 숫자 값을 넣는다.
		
		//5. 숫자 값이 이미 존재하는 경우
		// ==> 행은 2를 증가하고 열은 1을 감소한 위치에 다음 숫자값을 넣는다.
		
		//6. 행과 열이 모두 존재하지 않는 경우
		// ==>행은 2 증가하고 열은 1 감소한 위치에 다음 숫자 값을 넣는다.
		
		// 2번 작업을 반복 수행한다.
		int a=5; //a*a 형 마방진
		int[][] mabang=new int[a][a];
		int row, col; //row: 행 col: 열
		int num=1; //안에 들어갈 숫자
		row=0;
		col=(a-1)/2;
		mabang[row][col]=num;
		for(num=2;num<=a*a;num++) {
			//대각선 위로 이동한다.
			row--;
			col++;
			if(row<0 && col==a) {
				row+=2;
				col--;
			}
			else if(row<0 /*행이 존재하지 않은 경우*/) {
				row=a-1;
			}
			else if(col==a) {
				col=0;
			}
			else if(mabang[row][col]!=0) {
				row+=2;
				col--;
			}
			mabang[row][col]=num;
			
		}
		
		for(int i=0;i<mabang.length;i++) {
			for(int j=0;j<mabang[i].length;j++) {
				System.out.print(mabang[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
	}

}
