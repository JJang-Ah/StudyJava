package Javapro;

public class ReferenceEx1 {

	public static void main(String[] args) {
		//�⺻Ÿ��(Primitive Type)
		// int, byte, long, float, double, boolean, ���
		
//		//���� Ÿ��(Reference Type)
//		String str="korea";
//		System.out.println(str);
//		//str ���� 1����Ʈ�� ��� , ũ�Ⱑ �������� �ƴϴ�. �����ؼ� ���� ���� / �ּҸ� ������ �ִ�.
//		
//		
//		
//		//str : ���� >> �ٸ� �����ҿ� �ִٰ�  >>���� Ÿ��
//		
//		
//		String kor="�̰� �� �ѱ��̴�.";
//		System.out.println(kor);
//		str="computer";
//		System.out.println(str);
//		str=null;
//		System.out.println(str);
		
		String strValue1="ȫ�浿"; //String >> ��ü >��ü�� �޼ҵ带 ������.
		String strValue2="ȫ�浿";
		if(strValue1 == strValue2) {
			System.out.println("strValue1�� strValue2�� ������ ����");
			
		}else {
			System.out.println("strValue1�� strValue2�� ������ �ٸ�");		
		}
		
		if(strValue1.equals(strValue2)) {
			System.out.println("strValue1�� strValue2�� ���ڿ��� ����");
		}
		
		String strValue3=new String("ȫ�浿"); //new ��� ���� ���ο� �޸� ������ ����� ����.
		String strValue4=new String("ȫ�浿"); 
		
		if(strValue3 == strValue4) { //������ �ٸ��� ������ ������ �ٸ��� / String�� �ּ��μ�
			System.out.println("strValue3�� strValue4�� ������ ����");
			
		}else {
			System.out.println("strValue3�� strValue4�� ������ �ٸ�");		
		}
		
		if(strValue3.equals(strValue4)) {
			System.out.println("strValue3�� strValue4�� ���ڿ��� ����");
		}
		
		System.out.println(strValue1.equals(strValue2));
		
				
	}

}
