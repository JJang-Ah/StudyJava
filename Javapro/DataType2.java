package Javapro;

public class DataType2 {

	public static void main(String[] args) {
		byte num1=60;
		int num2=num1;
		System.out.println(num2);
		// ū ũ�� Ÿ�� = ���� ũ�� Ÿ�� �ڵ����� Ÿ�� ��ȯ�� �ȴ�.
		int num3=457123;
		byte num4=(byte)num3; //1byte�� ������ ©�� �����´�.
		
	// ���� Ÿ���� ū Ÿ���� �������� ���Ѵ�.
		System.out.println(num4);
		

		int num5=2000;
		double num6=num5;
		
		System.out.println(num6); // sout 
		
		double num7=4.23;
		int num8=(int)num7; // ���� Ÿ�Ժ�ȯ (ĳ����:casting)
		System.out.println(num8);
		
		char ch=(char)num1;
		System.out.println(ch);
	}

}
