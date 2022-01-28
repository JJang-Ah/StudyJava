package Javapro;

public class EnumEx2 {

	public static void main(String[] args) {
		Week today=Week.SUNDAY;
		String name=today.name(); //.~~() << ()가 없으면 필드 있으면 메소드 // 상수 SUNDAY를 문자열로 읽어준다
		System.out.println("선택한 요일은 : " + name);
		
		int ordi=today.ordinal(); //today가 가지고있는 상수의 순서
		System.out.println("상수의 위치 : "+ ordi);
		
		Week day1=Week.FRIDAY;
		Week day2=Week.SUNDAY;
		int result1 = day1.compareTo(day2); //day1-day2
		int result2 = day2.compareTo(day1);
		System.out.println("두 요일의 차이는 "+ result1);
		System.out.println("두 요일의 차이는 "+ result2);

		Week weekday = Week.valueOf("FRIDAY");
		System.out.println(weekday);
		
			
		
		
		
		
	}

}
