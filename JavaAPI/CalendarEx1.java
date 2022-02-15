package JavaAPI;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH);
		System.out.println(month);// �迭 ������ ������ �빮�� 1�� >0���� ���´�
		//�׷��� �Ʒ�ó�� ���ش�
		month = now.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int hour =now.get(Calendar.HOUR);
		System.out.println(hour);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		System.out.println(Calendar.MONDAY); //��:1, ��:2, ȭ:3 ~~~ �� ���ϵȴ�.
		
		String strWeek=null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "��";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "��";
			break;
		case Calendar.THURSDAY:
			strWeek = "��";
			break;
		case Calendar.FRIDAY:
			strWeek = "��";
			break;
		case Calendar.SATURDAY:
			strWeek = "��";
			break;
		case Calendar.SUNDAY:
			strWeek = "��";
			break;
		}
		System.out.println("������ " + strWeek + "���� �Դϴ�.");
		
		
		
	}

}
