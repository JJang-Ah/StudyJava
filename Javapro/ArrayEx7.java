package Javapro;

import javax.naming.ldap.SortControl;

public class ArrayEx7 {

	public static void main(String[] args) {
		//정렬(sort) : 무질서한 자료를 원하는 순서대로 재배열 하는 것
//		오름차순 정렬(Ascending sort) : 작은 것 > 큰 것
		//내림차순 정렬(Descending sort) : 큰것 >> 작은것
		
		//기본 자료
		//기본 자료 출력
		int[] nums= {56,7,96,45,20};
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//소트 알고리즘 구현
		int temp; //임시 기억장소 
		for(int a=0; a<nums.length-1;a++) { //비교하는 횟수라서 length-1 이다.
			for(int b=a+1; b<nums.length; b++) {
				if(nums[a]<nums[b]) {
					temp=nums[a];
					nums[a]=nums[b];
					nums[b]=temp;
				}
			}
		}
		//소트 된 결과 자료 출력
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		///지금 한건 selection sort방식인다.
		// bubble sort방식도 있따.
		
		
	}

}
