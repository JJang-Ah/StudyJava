package JavaAPI;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysEx4 {

	public static void main(String[] args) {


		int[] scores = {80,78,56,97,81};
//		String[] names = {"����ȣ","ȫ�浿","��ö��","����","��浿"};
//		int index = Arrays.binarySearch(names, "����");
//		System.out.println(index); //-1 ���� ��µȴ�.
//		// .binarySearch�� ������ sort�� ���� ����ؾ��Ѵ�.
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
//		index = Arrays.binarySearch(names, "����");
//		System.out.println(index);
		Arrays.sort(scores);
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ������?");
		int searchScores=sc.nextInt();
		int index=Arrays.binarySearch(scores, searchScores);
		System.out.println("����� ���� ����� " + (scores.length-index)+"���Դϴ�.");
		
	}

}
