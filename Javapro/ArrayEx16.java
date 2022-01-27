package Javapro;

public class ArrayEx16 {

	public static void main(String[] args) {
//		int[] nums= new int[5];
//		System.out.println(nums[0]);
//		
//		String[] strs=new String[5];
//		System.out.println(strs[0]);
//		 //빈 번지에는 null 이 나온다.
//		String str="korea";
//		System.out.println(str);
//		str=null; //null은 스택영역에서 string의 참조를 끊는 역할
//		System.out.println(str);
//	
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		
		//기본의 for문
		int[] scores= {85,96,74,93,30};
		int sum=0;
		double avg;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
			
		}
		
		avg=(double)(sum)/scores.length;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 향상된 for 문
		// for(타입 변수: 배열명){
		//
		int[] scores1= {85,96,74,93,30,39,27};
		int sum1=0;
		double avg1;
		for(int jum:scores1) { // scores 배열에 들어있는 값들을 jum 에 넣어준다.
			sum1+=jum;
		}
		avg1=(double)sum1/scores1.length;
		System.out.println("총점 : " + sum1);
		System.out.println("평균 : " + avg1);
		
		
		
		
		
	}

}
