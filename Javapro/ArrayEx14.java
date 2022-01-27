package Javapro;

public class ArrayEx14 {

	public static void main(String[] args) {
		// 배열 복사
		
		int[][][][] arry;
		int[] oldArray= {10,20,30};
		int[] newArray= new int[5];
		for(int i=0; i<oldArray.length; i++) {
			newArray[i]=oldArray[i];
			
			
		}
		for(int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
			
		}
		
	}

}
