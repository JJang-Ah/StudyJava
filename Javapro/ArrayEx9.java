package Javapro;

public class ArrayEx9 {

	public static void main(String[] args) {
		
		// ** ���� ����ǥ **
		// 1�� �̿��� : 96��
		// 2�� ~~
		// ~~
		
		int[] scores= {75,96,63,55,70,88};
		String[] names= {"ȫ�浿","�̿���", "��ö��","�̵���","����ȣ","�ӿ���"};
		
		for(int a=0; a<names.length-1;a++) {
			for(int b=a+1; b<names.length;b++) {
				if(scores[a]<scores[b]) {
					int temp;
					String tempname;
					
					temp=scores[a];
					scores[a]=scores[b];
					scores[b]=temp;
					
					tempname=names[a];
					names[a]=names[b];
					names[b]=tempname;
					
					
				}
			}	

		}
		System.out.println("** ���� ����ǥ **");
		for(int a=0;a<scores.length;a++) {
				System.out.println((a+1) + "�� " + names[a] + " : " + scores[a] + "��");

		
		}
	}

}
