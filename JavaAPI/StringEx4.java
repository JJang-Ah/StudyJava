package JavaAPI;

import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {

		//���� �ֹι�ȣ �ڸ��� �Ǵ��ϴ� ���α׷�
		//�ֹι�ȣ �Է� >> 981212-1234567
		//�ֹι�ȣ �ڸ����� �½��ϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ �Է� > ");
		String ssn = sc.next();
		System.out.println();
		if(ssn.length()==14) {
			System.out.println("�ֹ� ��ȣ �ڸ����� �½��ϴ�.");
		}else {
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�.");
		}
		
		
		
		
		
		
	}

}
