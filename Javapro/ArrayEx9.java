package Javapro;

public class ArrayEx9 {

	public static void main(String[] args) {
		
		// ** 시험 성적표 **
		// 1등 이영희 : 96점
		// 2등 ~~
		// ~~
		
		int[] scores= {75,96,63,55,70,88};
		String[] names= {"홍길동","이영희", "김철수","이동국","박찬호","임요한"};
		
		for(int a=0; a<names.length-1;a++) {
			for(int b=a+1; b<names.length;b++) {
				if(scores[a]<scores[b]) {
					int temp;
					String tempname;
					
					temp=scores[a];
					scores[a]=scores[b];
					scores[b]=temp;
					
					tempname=names[a];
					names[a]=names[b];
					names[b]=tempname;
					
					
				}
			}	

		}
		System.out.println("** 시험 성적표 **");
		for(int a=0;a<scores.length;a++) {
				System.out.println((a+1) + "등 " + names[a] + " : " + scores[a] + "점");

		
		}
	}

}
