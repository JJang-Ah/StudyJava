package Javapro;

public class EnumEx3 {

	public static void main(String[] args) { //args�� �Ű����� 
		String strDay=args[0];
		Week weekday=Week.valueOf(strDay);
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("������ �ָ��Դϴ�~");
			
		}else {
			System.out.println("������ ��ſ� ����~~");
			
		}
		
		
		Week[] days = Week.values();  //��ü �迭
		
		for(Week day:days) {		//�迭 �������� ���� for�� �±�
			System.out.println(day); 
		}
		
		boolean a = false;
		
		
	}

}
