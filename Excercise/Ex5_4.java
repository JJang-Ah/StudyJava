package Excercise;

public class Ex5_4 {

	public static void main(String[] args) {

		//������ (MAGIC square) 3*3 5*5 7*7 Ȧ������ �ٵȴ�.
		
		// ���η� ���ϵ� ���η� ���ϵ� �밢������ ���ϵ� �� ���� ���� ���´�.
		
		//1. ù���� �߰� ���� 1�� �ִ´�.
		//2. ���� �Է��� �� �밢�� ���� �̵��մϴ�.( �� )
		//3. ���� �������� ���� ���
		// ==>������ �࿡ ���� ���� ���� �ִ´�.
		//4. ���� �������� �ʴ� ���
		// ==>ù���� ���� ���� ���� �ִ´�.
		
		//5. ���� ���� �̹� �����ϴ� ���
		// ==> ���� 2�� �����ϰ� ���� 1�� ������ ��ġ�� ���� ���ڰ��� �ִ´�.
		
		//6. ��� ���� ��� �������� �ʴ� ���
		// ==>���� 2 �����ϰ� ���� 1 ������ ��ġ�� ���� ���� ���� �ִ´�.
		
		// 2�� �۾��� �ݺ� �����Ѵ�.
		int a=5; //a*a �� ������
		int[][] mabang=new int[a][a];
		int row, col; //row: �� col: ��
		int num=1; //�ȿ� �� ����
		row=0;
		col=(a-1)/2;
		mabang[row][col]=num;
		for(num=2;num<=a*a;num++) {
			//�밢�� ���� �̵��Ѵ�.
			row--;
			col++;
			if(row<0 && col==a) {
				row+=2;
				col--;
			}
			else if(row<0 /*���� �������� ���� ���*/) {
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
