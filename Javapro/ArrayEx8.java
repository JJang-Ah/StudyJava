package Javapro;

public class ArrayEx8 {

	public static void main(String[] args) {
		//이번에는 bubble sort 방식
		
		int[] nums= {56,7,96,45,20};
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//소트 알고리즘 구현 
		int temp; //임시 기억장소 
		for(int a=0; a<nums.length-1;a++) { //비교하는 횟수라서 length-1 이다.
			for(int b=0; b<nums.length-1-a; b++) {
				if(nums[b]<nums[b+1]) {
					temp=nums[b];
					nums[b]=nums[b+1];
					nums[b+1]=temp;
				}
			}
		}
		//소트 된 결과 자료 출력
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
