package Javapro;

public class IfCommand6 {

	public static void main(String[] args) {
		int num1=3672;
		if(num1<Byte.MIN_VALUE/* -128 �ᵵ�ȴ� */ || num1>Byte.MAX_VALUE/* 127 �ᵵ�ȴ�*/) {
			System.out.println("byte������ ��ȯ�� �� ���� ���Դϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���");
			
		}else {
		byte bnum1=(byte)num1;
		System.out.println(bnum1);
		
		
		
		}
	}

}
