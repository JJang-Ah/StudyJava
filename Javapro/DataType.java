package Javapro;

public class DataType {

	public static void main(String[] args) {
		// Ÿ��(��) �����̸�;
		// Ÿ��(��) �����̸�=��;
		//Ÿ�� ���� ����, �Ǽ�, ��
		//byte char short int long
		// 1byte = 8bit
		byte num1=-128; //�̷��� �� ����Ʈ�� ����, �ִ� 127���� ����
		// 0111 1111 >> 127 , 1111 1111 > -127 �Ǿ� ���ڴ� ������� ǥ��
		// �װ� ��ȣ��Ʈ��� �Ѵ�.
		//byte => -128 ~ 127
		// -128 = 1000 0000
		// 1111 1111 = -1 �̰� ����?!?!
//		7-3 > 111 - 011 > 111+100+1 > 1100 = -4
//		��ǻ�ʹ� ���⸦ ���Ѵ�.
		System.out.println(num1);
		short num2=300; // short >> 2byte=16bit ������
//		short > -32768 ~ 32767
//		int �� 4byte => -2147483648 ~ 2147483647
		System.out.println(num2);
//		long �� 8byte
		long num3=2200000000L; //L ���̸� literal ��ü�� ���̶�°� !
		System.out.println(num3);
		
//		char �� 2byte �ε� �� Ư���ϴ�.
		// ���ڸ� ǥ���ϴ� ����
//		0~65535
		char ch=44032;
		char ch1='��'; //'��'�� �ƽ�Ű�ڵ�� 
		
		System.out.println(ch);
		System.out.println(ch1);
//	�ѤѤѤѤѤѤѤѤѤѤѤѤѤѿ������ ���� Ÿ�� �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//		�������ʹ� �Ǽ� Ÿ��~~
//		float > 4byte �Ǽ���
//		���� 8bit + ���� 23bit 25.37 > 0.2537*10^2 >����:2537,����:2
//		double > 8byte �Ǽ���
//		���� 11 ���� 52bit
		float num4=2.5f; //f�� ���� ��ü�� float �������� Ȱ�� 
//		���� ��ü�� double�� �Ǿ��ֱ� ����
		System.out.println(num4);
		double num5=45.36;
		System.out.println(num5);
		// boolean �� ���� ex true false
		boolean stop=true;
		if(stop) {
			System.out.println("����!!!!");
			
		}else {
			System.out.println("����!!!");
			
		}
		
		
	}

}
