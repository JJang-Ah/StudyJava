package Javapro;

public class ArrayEx1 {

	public static void main(String[] args) {
		
//		// ������ �ϳ��� ���� ���� �� ���ִ� �����̴�.
//		int num1=30;
//		int num2=50;
//		int num3=70;
//		int num4=90;
//		int num5=84;
//		int sum;
//		sum=num1+num2+num3+num4+num5; //������ �� ������Ѵ�. ��� ���� ;; �׷��� �迭�� �ִ�!!!
//		System.out.println(num1);
//				}
		//�迭 - �ϳ��� �̸��� �������� ���� ����ϴ� ���
//		
		int nums[]= {89,78,98,65,5,89}; //= int[] nums={3,4,1,4,2,2];
		String chars[]= {"ȫ�浿","����","������","����","��ó","��Ʈ��"};
		int[] names=new int[5]; // 5���� ���� names �迭 ���� >> names[] = {0,0,0,0,0}
		System.out.println(names);
		System.out.println(nums[3]);
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			System.out.println(sum);
			
		}
		

	}

}
