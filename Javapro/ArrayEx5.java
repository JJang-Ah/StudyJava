package Javapro;

public class ArrayEx5 {

	public static void main(String[] args) {

		int ages[]= {35,23,65,42,64,58,24,67,31,54,68};
		int sales[] = {23000,75000,65000,30000,56000,79000,64000,66000,78000,41000,64000};
		//20�� ������ �����Ѿ� ���Ͻÿ�.
		//20�� �� �����Ѿ�?
		// �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//		int sum=0;
//		for(int i=0;i<ages.length;i++) {
//			switch (ages[i]/10) {
//			case 2:
//				sum+=sales[i];
//				continue;
//				
//			default:
//				continue;
//				
//			}
//		}
//		System.out.println("20�� ���� �Ѿ� : " + sum);
		//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѿ������ �����ѰŤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//		
//		int sum=0;
//		for(int i=0; i<ages.length; i++) {
//			if(ages[i]/10==2) {
//				sum+=sales[i];
//			}
//		}
//		System.out.println("20�� ���� �Ѿ� : " + sum);
		
		// �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѿ���� �������� ���ֽŰ� �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		
		
		int sum[]= new int[9];
		int j;
		for(int i=0; i<ages.length; i++) {
			for(j=0;j<sum.length;j++) {
				if(ages[i]/10==j) {
					sum[j]+=sales[i];			
				}
			}
		}
		for(j=0;j<sum.length;j++) {
			System.out.println(j+"0�� ���� �Ѿ� : "+ sum[j]);
		}
		
		
		//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ��̰� ���� �����ѰŤѤѤѤѤѤѿ��� ���� õ��....? �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
	}

}
