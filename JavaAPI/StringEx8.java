package JavaAPI;

public class StringEx8 {

	public static void main(String[] args) {

		String str= "     �ȳ�";
		System.out.println(str.length());
		
		String str2 = str.trim(); //������ �����ش�.
		System.out.println(str2);
		System.out.println(str2.length());
		
		
		String num1 = "12";
		String num2 = "34";
		//parseint >> ���ڰ��� ���������� �ٲ��ش�.
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
		
		String str3 = String.valueOf(20); //valueof >> ��� ���� ���ڷ� �ٲ��ش�.
		String str4 = String.valueOf(40);
		System.out.println(str3+str4);
		
		String text = "ȫ�浿, ��ö��, �̿���$ ¯��% �����";
		//split ������ 
		String[] names = text.split(",|$|%");  // |���̿��� �پ��� �����ڸ� ������մ�.
		//,�� ���� ���ڿ��� �������ָ� ,�� ���ڿ��� ���� �ʴ´�.
		for(String m : names) {
			System.out.println(m.trim());
		}
		
		
		
	}

}
