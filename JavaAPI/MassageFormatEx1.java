package JavaAPI;

import java.security.MessageDigest;
import java.text.MessageFormat;

public class MassageFormatEx1 {

	public static void main(String[] args) {

		String id = "hongil";
		String name = "ȫ�浿";
		String tel = "010-123-1231";
		
		String text = "ȸ�� ID : {0} \n ȸ�� �̸� : {1} \n ȸ�� ��ȭ��ȣ : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
	}

}
