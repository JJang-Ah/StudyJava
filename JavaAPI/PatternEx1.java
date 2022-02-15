package JavaAPI;
import java.util.regex.Pattern;

public class PatternEx1 {

	public static void main(String[] args) {

		System.out.println("�ȳ��ϼ���\n������ ȭ����"); // \n : �ٹٲ� 
		System.out.println("ö���� ���ߴ� \"�ȳ�\"�̶��");

		
		//���� ǥ����
		String data = "010-1234-1234";
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		// \d{a,b} : a~b�ڸ��� ���ڰ� �����Ѵ�.
		System.out.println(regExp);
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result);
		if(result) {
			System.out.println("�ùٸ� ��ȭ�Դϴ�.");
		}else {
			System.out.println("��ȭ��ȣ ������ Ʋ���ϴ�.");
		}
		
		String email = "gildong@naver.com";
		String eRegExp = "\\w+@\\w+\\.\\w+(\\.w+)?";
		boolean eresult = Pattern.matches(eRegExp, email);
		if(eresult) {
			System.out.println("�ùٸ� �̸��� �����Դϴ�.");
		}else {
			System.out.println("�̸��� ������ Ʋ���ϴ�.");
		}
		
		
		
		
		
	}

}
