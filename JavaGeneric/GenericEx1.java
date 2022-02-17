package JavaGeneric;

import java.util.ArrayList;
import java.util.List;

public class GenericEx1 {

	public static void main(String[] args) {

//		int[] nums = new int[5];
//		nums[0] = 10;
//		nums[1] = 93;
//		nums[4] = 29;
////		nums[5] = 49;
//		
//		for(int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
		List nums = new ArrayList();
		nums.add(10); //
		nums.add(38);
		nums.add(18);
		nums.add(84);
		nums.add(42);
		nums.add(52);
		nums.remove(3);
		
		System.out.println(nums);
		System.out.println(nums.get(4));
		for(int i=0; i<nums.size(); i++) { 
			System.out.println(nums.get(i));
		}
		
	}

}
