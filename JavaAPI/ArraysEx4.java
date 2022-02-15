package JavaAPI;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysEx4 {

	public static void main(String[] args) {


		int[] scores = {80,78,56,97,81};
//		String[] names = {"박찬호","홍길동","김철수","고영희","고길동"};
//		int index = Arrays.binarySearch(names, "고영희");
//		System.out.println(index); //-1 값이 출력된다.
//		// .binarySearch를 쓰려면 sort를 쓰고 사용해야한다.
//		Arrays.sort(scores);
//		Arrays.sort(names);
//		for(int i=0; i<scores.length;i++) {
//			System.out.print(scores[i]+ " ");
//		}
//		System.out.println();
//		for(int i=0;i<names.length; i++) {
//			System.out.print(names[i] + " ");
//		}
//		System.out.println();
//		index = Arrays.binarySearch(names, "고영희");
//		System.out.println(index);
		Arrays.sort(scores);
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 점수는?");
		int searchScores=sc.nextInt();
		int index=Arrays.binarySearch(scores, searchScores);
		System.out.println("당신의 성적 등수는 " + (scores.length-index)+"등입니다.");
		
	}

}
