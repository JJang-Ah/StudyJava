package Javapro;

public class ForEx7 {

	public static void main(String[] args) {

		//����) Ž�谡�� �������� ã�� ���� ���� ����~~
		//!! ������ �߰�~! -�����߰� - ��2kg¥���� 30��!! �װ� ������ �ϰ� 3kg ¥���� 30��!! 
		// ������... �迡 ���簡���� ���Դ� 100kg.. Ž�谡�� �����Դ� 70kg �̳� �ȴپ� ���� ���ۿ� ��������
		//2kg ¥���� � 3kg ¥���� � ������ �ִ��� ��� ����� ���� ���غ���
		int i;
		int j;
		for(i=0;i<=30;i++) {
			for(j=0;j<=30;j++) {
				if((i*2+j*3)==30) {
					System.out.println("================");
					System.out.print("2kg ¥�� "+i + "��, ");
					System.out.println("3kg ¥�� "+j + "��");
					System.out.println("================");

				}
				
			}
		}
	}

}
