package Javapro;

public class ForEx6 {

	public static void main(String[] args) {
		//����) ���� ���� �Ĵ� - ���� ����(����, Ÿ��)
		//���� -���翡 (56)���̶�� ����� 
		//������ 17���� - ?????��
		//���� ��� Ÿ�� ��� ����
		
		int pig;
		int tajo;
		for(pig=0;pig<=17;pig++) {
			tajo=17-pig;
			if((pig*4)+(tajo*2)==56) {
				System.out.println("���� : " + pig + "����");
				System.out.println("Ÿ�� : " + tajo + "����");
				break;
				
			}
		}
		//================��������� ���� �����===============
		
		int sum; //�ٸ� ���� ��
		for(int i=1; i<=17; i++) {
			for(int j=1; j<=17; j++) {
				sum=i*4+j*2;
				if(sum==56 && i+j==17) {
					System.out.println("���� ���� ���� "+ i +"����");
					System.out.println("Ÿ�� ���� ���� " + j + "����");
					
					
					
				}
			}
		}
	}

}
