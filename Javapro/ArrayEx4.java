package Javapro;

public class ArrayEx4 {

	public static void main(String[] args) {
		//�ζ� ��ȣ �ڵ�����
		
		int lotto[]= new int[6];
		boolean run=true;
		while(run) {
			//6���� �ζǹ�ȣ ���� ����
			for(int i=1;i<lotto.length;i++) {
				lotto[i]=(int)(Math.random()*45)+1;
			}
			
			run=false;
			Outter:	for(int a=0; a<lotto.length;a++) {
						for(int b=a+1; b<lotto.length; b++) {
							if(lotto[a]==lotto[b]) {
								run=true;
								break Outter;
							
							}
						}
					}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

}
