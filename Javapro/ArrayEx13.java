package Javapro;

public class ArrayEx13 {

	public static void main(String[] args) {
		//string : ���� ��ü �迭

		String[] strArray=new String[3]; 	//��ü �迭 ����
		strArray[0]="ȫ�浿";
		strArray[1]="ȫ�浿";
		strArray[2]=new String("ȫ�浿"); //��ü ����
		int[] nums=new int[3];
		nums[0]=10;
		nums[1]=30;
		nums[2]=50;
		
		if(nums[0]==nums[1]) {
			System.out.println("���� ���Դϴ�.");
			
		}else {
			System.out.println("�ٸ� ���Դϴ�.");
		}
		
		if(strArray[0]==strArray[2]) {
			System.out.println("���� �����Դϴ�.");
			
		}else {
			System.out.println("�ٸ� �����Դϴ�.");
		}
		if(strArray[0].equals(strArray[2])) {
			System.out.println("���� �����Դϴ�.");
		}else {
			System.out.println("�ٸ� �����Դϴ�.");
		}
		
		
		
		
		
		
		
		
	}

}
