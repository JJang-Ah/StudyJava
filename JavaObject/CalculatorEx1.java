package JavaObject;

public class CalculatorEx1 {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		int[] values1 = {23,14,512,213};
		int result1=myCalc.add(values1);
		System.out.println("���� ��� ��� : " +result1);
		
		int result2=myCalc.add(new int[] {15,7,43,5,3,52,2});
		// int[] �̸��� ���� << �͸� ��ü
		System.out.println("���� ��� ��� : "+ result2);
		
		int result3= myCalc.add(13,24,31,24,31,23);
		System.out.println("���� ��� ��� : "+ result3);
		double result4 = myCalc.Divide(431, 13);
		System.out.println("��� ��� : " + result4);
		
		//�޼ҵ� ȣ��
		//���� ȣ�� >> �޼ҵ��̸�(�Ű�����)
		//�ܺ� ȣ�� >> new ��ü�� ���� �� ��ü�̸�.�޼����̸�(�Ű���)
		
		
		
		
		
		
	}

}
