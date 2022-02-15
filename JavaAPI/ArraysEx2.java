package JavaAPI;

import java.util.Arrays;

public class ArraysEx2 {

	public static void main(String[] args) {

		int[] scores = {80,78,56,97,81,64};
		Arrays.sort(scores); //배열 오름차순 정렬
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i]+" ");
		}
		System.out.println();
		
		String[] names = {"박찬호","홍길동","김철수","고영희","고길동"};
		
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		for(int i=names.length-1; i>=0; i--) {
			System.out.print(names[i]+" ");
		}
		
		
	}

}
