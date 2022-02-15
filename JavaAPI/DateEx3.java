package JavaAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class DateEx3 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); 
		System.out.println("���� ��¥ : " + date);
		LocalDate dday = date.plusYears(10);
		System.out.println("10�� �� ��¥ : " + dday);
		LocalDate dmonth = date.plusMonths(10);
		System.out.println(dmonth);
		LocalDate dday2 = date.plusDays(300);
		System.out.println(dday2);
		LocalDateTime dateTime = LocalDateTime.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy�� MM�� d�� a h�� m��");
		System.out.println(dtf.format(dateTime));
		

	}

}
