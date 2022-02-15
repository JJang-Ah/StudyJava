package JavaAPI;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH);
		System.out.println(month);// 배열 순서가 나오기 대문에 1월 >0으로 나온다
		//그래서 아래처럼 해준다
		month = now.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int hour =now.get(Calendar.HOUR);
		System.out.println(hour);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		System.out.println(Calendar.MONDAY); //일:1, 월:2, 화:3 ~~~ 로 리턴된다.
		
		String strWeek=null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		System.out.println("오늘은 " + strWeek + "요일 입니다.");
		
		
		
	}

}
