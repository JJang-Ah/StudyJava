package JavaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {

		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월-dd일");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("a hh시 mm분 ss초");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("오늘은 E요일입니다!.");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy년의 D일째 되는 날");
		System.out.println(sdf.format(now));
	}

}
