package Javapro;

public class EnumEx3 {

	public static void main(String[] args) { //args는 매개변수 
		String strDay=args[0];
		Week weekday=Week.valueOf(strDay);
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("오늘은 주말입니당~");
			
		}else {
			System.out.println("오늘은 즐거운 평일~~");
			
		}
		
		
		Week[] days = Week.values();  //객체 배열
		
		for(Week day:days) {		//배열 읽을때는 향상된 for문 굿굿
			System.out.println(day); 
		}
		
		boolean a = false;
		
		
	}

}
