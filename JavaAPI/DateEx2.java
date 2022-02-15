package JavaAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateEx2 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now(); //그저 날짜정보만 가져오는 것
		System.out.println("현재 날짜 : " + date);
		System.out.println("현재 날짜 : " + date.getYear() + "년"+date.getMonthValue()+"월"+
		date.getDayOfMonth()+"월");
		LocalDate date2 = LocalDate.of(2022, 07, 04);
		System.out.println("수료 일자 : " + date2);
		
		LocalTime time = LocalTime.now();
		System.out.println("현재 시간 : " + time);
		LocalTime time2 = LocalTime.of(07, 30, 20);
		System.out.println("기상 시간 : " + time2);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : " + dateTime);
		
		
	}

}
