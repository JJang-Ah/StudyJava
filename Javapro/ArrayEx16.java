package Javapro;

public class ArrayEx16 {

	public static void main(String[] args) {
//		int[] nums= new int[5];
//		System.out.println(nums[0]);
//		
//		String[] strs=new String[5];
//		System.out.println(strs[0]);
//		 //�� �������� null �� ���´�.
//		String str="korea";
//		System.out.println(str);
//		str=null; //null�� ���ÿ������� string�� ������ ���� ����
//		System.out.println(str);
//	
		//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		
		
		//�⺻�� for��
		int[] scores= {85,96,74,93,30};
		int sum=0;
		double avg;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
			
		}
		
		avg=(double)(sum)/scores.length;
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		// �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		// ���� for ��
		// for(Ÿ�� ����: �迭��){
		//
		int[] scores1= {85,96,74,93,30,39,27};
		int sum1=0;
		double avg1;
		for(int jum:scores1) { // scores �迭�� ����ִ� ������ jum �� �־��ش�.
			sum1+=jum;
		}
		avg1=(double)sum1/scores1.length;
		System.out.println("���� : " + sum1);
		System.out.println("��� : " + avg1);
		
		
		
		
		
	}

}
