package JavaAPI;

public class StringEx2 {

	public static void main(String[] args) {

		String str = "computer";
		char cValue = str.charAt(3);//3�ڸ��� �ִ� �����ϳ��� �����´�.
		System.out.println(cValue);
		//���� ss10023 ����ڵ�
		// ss �Ｚ
		// ����° 1�ڸ��� �μ��� (1.�渮�� 2.������ 3.�����)
		// �׹�°���� �������� �׳� �����ȣ
		String cnum = "SS10023"; 
		switch (cnum.charAt(2)) {
		case '1':
			System.out.println("�渮��");
			break;
		case '2':
			System.out.println("������");
			break;
		case '3':
			System.out.println("�����");
			break;
		}
		
		
		String ssn = "920512-2354711";
		//���� ssn�� �ֹε�Ϲ�ȣ�̴�. ������ �Ǵ��Ͻÿ�.
		
		switch (ssn.charAt(7)) {
		case '1':
			System.out.println("�����Դϴ�");
			break;
		case '2':
			System.out.println("�����Դϴ�");
			break;
		}
		
		
		if(ssn.charAt(7) == 1 || ssn.charAt(7) ==3) {
			System.out.println("���ڵ���");
		}else if(ssn.charAt(7) == 2 || ssn.charAt(7) ==4) {
			System.out.println("���ڵ���");
		}
		
		
	}

}
