package JavaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {

		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��-MM��-dd��");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("a hh�� mm�� ss��");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("������ E�����Դϴ�!.");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy���� D��° �Ǵ� ��");
		System.out.println(sdf.format(now));
	}

}
