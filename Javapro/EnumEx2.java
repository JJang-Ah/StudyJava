package Javapro;

public class EnumEx2 {

	public static void main(String[] args) {
		Week today=Week.SUNDAY;
		String name=today.name(); //.~~() << ()�� ������ �ʵ� ������ �޼ҵ� // ��� SUNDAY�� ���ڿ��� �о��ش�
		System.out.println("������ ������ : " + name);
		
		int ordi=today.ordinal(); //today�� �������ִ� ����� ����
		System.out.println("����� ��ġ : "+ ordi);
		
		Week day1=Week.FRIDAY;
		Week day2=Week.SUNDAY;
		int result1 = day1.compareTo(day2); //day1-day2
		int result2 = day2.compareTo(day1);
		System.out.println("�� ������ ���̴� "+ result1);
		System.out.println("�� ������ ���̴� "+ result2);

		Week weekday = Week.valueOf("FRIDAY");
		System.out.println(weekday);
		
			
		
		
		
		
	}

}
