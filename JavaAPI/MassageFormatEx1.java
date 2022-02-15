package JavaAPI;

import java.security.MessageDigest;
import java.text.MessageFormat;

public class MassageFormatEx1 {

	public static void main(String[] args) {

		String id = "hongil";
		String name = "홍길동";
		String tel = "010-123-1231";
		
		String text = "회원 ID : {0} \n 회원 이름 : {1} \n 회원 전화번호 : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
	}

}
