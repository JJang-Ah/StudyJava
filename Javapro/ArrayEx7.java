package Javapro;

import javax.naming.ldap.SortControl;

public class ArrayEx7 {

	public static void main(String[] args) {
		//����(sort) : �������� �ڷḦ ���ϴ� ������� ��迭 �ϴ� ��
//		�������� ����(Ascending sort) : ���� �� > ū ��
		//�������� ����(Descending sort) : ū�� >> ������
		
		//�⺻ �ڷ�
		//�⺻ �ڷ� ���
		int[] nums= {56,7,96,45,20};
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//��Ʈ �˰��� ����
		int temp; //�ӽ� ������ 
		for(int a=0; a<nums.length-1;a++) { //���ϴ� Ƚ���� length-1 �̴�.
			for(int b=a+1; b<nums.length; b++) {
				if(nums[a]<nums[b]) {
					temp=nums[a];
					nums[a]=nums[b];
					nums[b]=temp;
				}
			}
		}
		//��Ʈ �� ��� �ڷ� ���
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		///���� �Ѱ� selection sort����δ�.
		// bubble sort��ĵ� �ֵ�.
		
		
	}

}
