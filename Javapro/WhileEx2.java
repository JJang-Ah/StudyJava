package Javapro;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {

//		double num0=Math.abs(-5); //abs�� ���밪 ���ϴ� ��
//		System.out.println(num0);
//		int num=(int)(Math.random()*6)+1; 
//		System.out.println(num);
//		
		
		
		int com=(int)(Math.random()*100)+1; //1~100���� ���� �ϳ� �߻�
		int my; //���� �Է��ϴ� ��
		int count=0; // �Է� Ƚ��
		boolean game=true;
		
		Scanner sc = new Scanner (System.in);
		
		while(game) {
			System.out.print("1-100������ ���ڸ� �־���� >> ");
			my=sc.nextInt();
			if(com>my && my>0) {
				System.out.println("����� ���ں��� Ů�ϴ�. �� ū �� ����");
				count++;
				System.out.println("������ Ƚ�� : " + count);
			}else if (com<my && my<100) {
				System.out.println("����� ���ں��� �۾ƿ�~. �� ���� �� ����" );
				count++;
				System.out.println("������ Ƚ�� : " + count);

			}else if (com==my) {
				System.out.println("�� ����~~ ������ �ٷιٷ� ["+com+ "]�����ϴ�.~");
				count++;
				System.out.println(count + "�� ���� ����~~~");
				game=false;
				
			}else {
				System.out.println("���� ����� �־�� ;;");
			}
			
			
		}
		System.out.println("���ӳ�");
	}

}


//while(���ǽ�){
//���๮;
//....
//}


//��������! : ���ѷ����� �� �� �ִ�. �׷��� �ȵȴ�
