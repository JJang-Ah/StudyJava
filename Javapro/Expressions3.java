package Javapro;

public class Expressions3 {

	public static void main(String[] args) {
		//���� ������ : ++ -- >> ������ �����ϳ��� �ܵ����� ����Ѵ�.
		int num1=10;
		num1++;
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		num1--;
		System.out.println(num1);
		System.out.println(++num1); //�����ϰ� ���
		System.out.println(num1++); // ����ϰ� ����
		
		boolean play=true;
		System.out.println(play);
		System.out.println(!play); //!, ~ : ���� ������
		play=!play;
		System.out.println(play);
		
		int a = 20;
		int b = ~a;
		System.out.println(b);
		//�� ������ : >, >=, ==, !=, <, <=
		
		//�� ������ &&(AND), ||(OR), 
		//����Ʈ ������ : << >> >>>
		
		int result=1 << 3; //�������� 3bit �̵�
		System.out.println(result);
		
		int result1=8 >>2;
		System.out.println(result1);
		
		
		
		
		
	}

}
