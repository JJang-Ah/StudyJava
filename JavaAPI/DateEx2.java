package JavaAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateEx2 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now(); //���� ��¥������ �������� ��
		System.out.println("���� ��¥ : " + date);
		System.out.println("���� ��¥ : " + date.getYear() + "��"+date.getMonthValue()+"��"+
		date.getDayOfMonth()+"��");
		LocalDate date2 = LocalDate.of(2022, 07, 04);
		System.out.println("���� ���� : " + date2);
		
		LocalTime time = LocalTime.now();
		System.out.println("���� �ð� : " + time);
		LocalTime time2 = LocalTime.of(07, 30, 20);
		System.out.println("��� �ð� : " + time2);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð� : " + dateTime);
		
		
	}

}
