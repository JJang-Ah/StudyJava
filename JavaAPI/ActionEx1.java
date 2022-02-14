package JavaAPI;

import java.util.Scanner;

public class ActionEx1 {

	public static void main(String[] args) {

		try {
			Class class1=null;
			Scanner sc= new Scanner(System.in);
			System.out.println("������ Ŭ������ ���� (1.���� 2.����)");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				class1=Class.forName("JavaAPI.ReceiveAction");
				break;
			case 2:
				class1=Class.forName("JavaAPI.SendAction");
				break;
			}
			//JavaAPI��Ű���� SendAction
			Action action = (Action)class1.newInstance(); //���� ��ü ����
			action.execute(); //new�� ��������ʰ� 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("�ش� Ŭ������ �����ϴ�.");
		} catch (InstantiationException e) {
			System.out.println("�ش� Ŭ������ �������̽��ų� �߻� Ŭ�����Դϴ�.");
		} catch (IllegalAccessException e) {
			System.out.println("Ŭ������ �����ڰ� ������ �� �����ϴ�.");
		}
		
	}

}
