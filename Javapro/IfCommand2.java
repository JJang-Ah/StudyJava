package Javapro;

import java.util.Scanner;

public class IfCommand2 {

	public static void main(String[] args) {
		System.out.print("������ ������ �Է��� �ֶ�~ >> ");
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		System.out.print("��ǰ �ݾ��� �Է����ּ��� >> ");
		int price=sc.nextInt();
		String memo="(����)";
		if (amount>=10 && price>= 1000) {
			price=(int)(price*0.80);
			memo="(���ΰ�)";
		}
		System.out.println("�Ǹűݾ�="+price*amount+memo);
		
	}

}

//����) �Ǹűݾ��� ����ϴ� ���α׷��� �ϼ��Ͻÿ�.
// �Ǹűݾ�=����*�ܰ�
//����1) ������ 10���̻��̸� ���ΰ��� ����
//����2) ��ǰ�ݾ��� 1000�� �̸�ǰ���� ����
