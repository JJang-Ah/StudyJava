package Javapro;

import java.util.Calendar;

public class EnumEx1 {

	public static void main(String[] args) {
		//열거 타입
		//배열 을 상수처럼 처리
		Week today=null;
		if(today==Week.SUNDAY || today==Week.SATURDAY) {
			System.out.println("주말이네~~! 쉬자~");
		}
		
		System.out.println(today);
		
		
		
		Calendar cal=Calendar.getInstance(); //시스템의 날짜와 시간 정보를 가져와 준다.
		System.out.println(cal.get(Calendar.YEAR)); 
		System.out.println(cal.get(Calendar.MONTH)); // 배열 0번째 >> 1월 그래서 0으로 나온다.
		System.out.println(cal.get(Calendar.DATE)); 
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); 
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //배열 0번째 >> 일요일,배열 1번째 >> 월요일
		
		int w=cal.get(Calendar.DAY_OF_WEEK);
		switch(w) {
		case 1:
			today=Week.SUNDAY;
			break;
		case 2:
			today=Week.MONDAY;
			break;
		case 3:
			today=Week.TUESDAY;
			break;
		case 4:
			today=Week.WENDESDAY;
			break;
		case 5:
			today=Week.THURSDAY;
			break;
		case 6:
			today=Week.FRIDAY;
			break;
		case 7:
			today=Week.SATURDAY;
			break;
		}
		System.out.print("오늘은 무슨 요일 일까나~~~ 바로바로 >> " + today + "!!");	
		
		
	}
}
