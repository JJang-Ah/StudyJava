package Javapro;

public class Switch3 {

	public static void main(String[] args) {
		char grade='B';
		switch(grade) {
			case 'a':
			case 'A': //�̷��� �ϸ� �ҹ��� ����� ������� ���� ���๮�� �����
				System.out.println("��� ȸ���Դϴ�.");
				System.out.println("10% ������ ���� �� �ֽ��ϴ�.");
				break;
			case 'b':	
			case 'B':
				System.out.println("�Ϲ� ȸ���Դϴ�.");
				System.out.println("5$ ������ ���� �� �ֽ��ϴ�.");
				break;
			default:
				System.out.println("�մ��Դϴ�.");
				break;
		}
		
	
	}

}


//�ݺ���
//for, while, do while
//for(�ʱ�ȭ��;���ǽ�;������) {
//�ݺ��� ���๮;
//....
//}

