package JavaAPI;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {

		int[] nums1 = {10,20,30,40};
//		int[] nums2 = Arrays.copyOf(nums1, 2); //0���� 2���� �����´�
		//�迭 ���� 1
		int[] nums2 = Arrays.copyOf(nums1, nums1.length);
		System.out.println(nums2[1]);
		
		nums2[1] = 59;
		System.out.println(nums1[1]);
		System.out.println(nums2[1]);
		
		//�迭 ���� 2
		int[] nums3 = Arrays.copyOfRange(nums1, 1, 3); 
		// nums1�� 1��° ����� 3���� ������ ����
		for(int i=0; i<nums3.length; i++) {
			System.out.print(nums3[i] + " ");
		}
		System.out.println();
		
		//�迭 ���� 3
		int[] nums4 = new int[nums1.length];
		System.arraycopy(nums1, 0, nums4, 0, nums1.length);
		for(int i=0; i<nums4.length; i++) {
			System.out.print(nums4[i] + " ");
			
		}
		
		
		

		
		
	}

}
