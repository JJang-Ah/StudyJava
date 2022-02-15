package JavaAPI;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {

		int[] nums1 = {10,20,30,40};
//		int[] nums2 = Arrays.copyOf(nums1, 2); //0부터 2개를 가져온다
		//배열 복사 1
		int[] nums2 = Arrays.copyOf(nums1, nums1.length);
		System.out.println(nums2[1]);
		
		nums2[1] = 59;
		System.out.println(nums1[1]);
		System.out.println(nums2[1]);
		
		//배열 복사 2
		int[] nums3 = Arrays.copyOfRange(nums1, 1, 3); 
		// nums1의 1번째 방부터 3번방 전까지 복사
		for(int i=0; i<nums3.length; i++) {
			System.out.print(nums3[i] + " ");
		}
		System.out.println();
		
		//배열 복사 3
		int[] nums4 = new int[nums1.length];
		System.arraycopy(nums1, 0, nums4, 0, nums1.length);
		for(int i=0; i<nums4.length; i++) {
			System.out.print(nums4[i] + " ");
			
		}
		
		
		

		
		
	}

}
