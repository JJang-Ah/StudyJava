package Javapro;

import java.util.Calendar;

public class EnumEx1 {

	public static void main(String[] args) {
		//���� Ÿ��
		//�迭 �� ���ó�� ó��
		Week today=null;
		if(today==Week.SUNDAY || today==Week.SATURDAY) {
			System.out.println("�ָ��̳�~~! ����~");
		}
		
		System.out.println(today);
		
		
		
		Calendar cal=Calendar.getInstance(); //�ý����� ��¥�� �ð� ������ ������ �ش�.
		System.out.println(cal.get(Calendar.YEAR)); 
		System.out.println(cal.get(Calendar.MONTH)); // �迭 0��° >> 1�� �׷��� 0���� ���´�.
		System.out.println(cal.get(Calendar.DATE)); 
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); 
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //�迭 0��° >> �Ͽ���,�迭 1��° >> ������
		
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
		System.out.print("������ ���� ���� �ϱ~~~ �ٷιٷ� >> " + today + "!!");	
		
		
	}
}
