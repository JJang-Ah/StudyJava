package JavaAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class DateEx3 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); 
		System.out.println("현재 날짜 : " + date);
		LocalDate dday = date.plusYears(10);
		System.out.println("10년 뒤 날짜 : " + dday);
		LocalDate dmonth = date.plusMonths(10);
		System.out.println(dmonth);
		LocalDate dday2 = date.plusDays(300);
		System.out.println(dday2);
		LocalDateTime dateTime = LocalDateTime.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 d일 a h시 m분");
		System.out.println(dtf.format(dateTime));
		

	}

}
