package Javapro;

import java.util.Scanner;

public class IfCommand5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ű�� �Է����ּ��� >> ");
		double key=sc.nextDouble();
		System.out.print("�����Ը� �Է����ּ��� >> ");
		double mom=sc.nextDouble();
		
		double pyojun;
		pyojun=(key-100)*0.9;
		
		if(mom<=(pyojun+5) && mom>=(pyojun-5)) {
			System.out.println("����� ����������Դϴ�! �� ���¸� �����ϼ���!");
		}else if(mom<=(pyojun-5)) {
			System.out.println("����� �ʹ� ������� ����Ҹ� �� �����ϼ���!");
		}else if(mom>(pyojun+5)) {
			System.out.println("���Դϴ�! �Ĵܰ����� ��� ���ּ���!");
		}
		
		
		
	}

}
//
//
//�񸸵� üũ ���α׷�
////����) �Է½�ĳ�ʸ� ���� Ű�� �����Ը� �Է¹޾� �񸸵� üũ ���α׷��� �ϼ��Ͻÿ�
////ǥ�ظ�����=(�ڽ��� Ű- 100)*0.9
//���� ǥ�ظ������� +5 -5
//����ü��
//��
//
//��) Ű�� �Է����ּ��� >> 170
//�����Ը� �Է����ּ��� >> 62

