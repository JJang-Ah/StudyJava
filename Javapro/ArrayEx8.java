package Javapro;

public class ArrayEx8 {

	public static void main(String[] args) {
		//�̹����� bubble sort ���
		
		int[] nums= {56,7,96,45,20};
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//��Ʈ �˰��� ���� 
		int temp; //�ӽ� ������ 
		for(int a=0; a<nums.length-1;a++) { //���ϴ� Ƚ���� length-1 �̴�.
			for(int b=0; b<nums.length-1-a; b++) {
				if(nums[b]<nums[b+1]) {
					temp=nums[b];
					nums[b]=nums[b+1];
					nums[b+1]=temp;
				}
			}
		}
		//��Ʈ �� ��� �ڷ� ���
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
