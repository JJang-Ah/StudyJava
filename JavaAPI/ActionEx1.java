package JavaAPI;

import java.util.Scanner;

public class ActionEx1 {

	public static void main(String[] args) {

		try {
			Class class1=null;
			Scanner sc= new Scanner(System.in);
			System.out.println("실행할 클래스를 선택 (1.보냄 2.받음)");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				class1=Class.forName("JavaAPI.ReceiveAction");
				break;
			case 2:
				class1=Class.forName("JavaAPI.SendAction");
				break;
			}
			//JavaAPI패키지의 SendAction
			Action action = (Action)class1.newInstance(); //동적 개체 생성
			action.execute(); //new를 사용하지않고 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("해당 클래스가 없습니다.");
		} catch (InstantiationException e) {
			System.out.println("해당 클래스가 인터페이스거나 추상 클래스입니다.");
		} catch (IllegalAccessException e) {
			System.out.println("클래스나 생성자가 접근할 수 없습니다.");
		}
		
	}

}
