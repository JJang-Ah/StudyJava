package Javapro;

public class Literal {

	public static void main(String[] args) {
		int num1=25+367; // ������ ���̳ʸ��� �Ѱ� 
		double num2=25.7+3.15;// �ε� �Ҽ��� �� = �Ǽ�
		//, �Ǽ��� ������ ������ �ΰ��� ����������.
//		������   ������
//	 	0.257 *10^2
//   + 	0.0315*10^2
		double num3=5.0/2;
		int num4=015; //�տ� 0�� ������ 8������ �ν��Ѵ�.
		int num5=0xA6; //�տ� 0x �� ������ 16���� 
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		double num6=5E7; // >>5���ϱ� 10��7��
		System.out.println(num6);
		
		char ch='A'; //ū����ǥ�� ���ڿ�, ��������ǥ�� �ϳ��� ���ڸ� ����
		System.out.println(ch);

		int num7=65;
		System.out.printf("%d",  num7); // 65�� ���
		System.out.printf("%c",  num7); // A�� ���

		System.out.println(num7);
		
		boolean bool=true; // ������ �Ǻ��ϴ� ��ɹ� ���� if���� ����
		//true, false �� ���ڰ� �ƴϴ�!
		System.out.println(bool);
		
		
		

		
	}

}
