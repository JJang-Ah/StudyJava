package Javapro;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
//		���ǹ� 
//		switch(����)
//		 case ��: // ������ �ִ°��� �´� case ���� ������ ���๮�� ������ �����Եȴ�.
//		  ���๮;
//		  break;
//		 case ��:
//		  ���๮;
//		  break;
//		 case ��:
//		  ���๮;
//		  break;
//		 case ��:
//		  ���๮;
//		  break;
//		 default:
//			 ���๮; // case �ƹ������� �ɸ��� �ʴ´ٸ� default�� �����Ѵ�.
//			
		
		System.out.print("�������� ��ȣ�� �����ϼ���~(1.���� 2.���� 3.������)>> ");
		Scanner sc= new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1: //break�� ������ ex 1�� �Է��ϸ� case 1,2,3, default ���๮�� ���� ����ȴ�.
			System.out.println("1�� �ȳ�����ũ�� ��������");
			break;
		case 2:
			System.out.println("2�� �ȳ�����ũ�� ��������");
			break;
		case 3:
			System.out.println("���� �ȳ�����ũ�� ��������");
			break;
		default:
			System.out.println("������ ������ �߸��Ǿ����ϴ�.");
			break;
			
		}
		
		System.out.println("���� Ʈ�� �Ǽ���~");
		
		
	}

}
