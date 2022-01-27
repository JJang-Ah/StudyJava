package Javapro;

public class ArrayEx3 {

	public static void main(String[] args) {

		int[] nums= {51,32,5,74,953,46,64,53,77,87};
		int sum=0;
		int hol=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) {
				sum+=nums[i];	
			}else {
				hol+=nums[i];
			}
		}
		System.out.println("Â¦¼öÀÇ ÇÕ : " + sum);
		System.out.println("È¦¼öÀÇ ÇÕ : " + hol);
	}

}
