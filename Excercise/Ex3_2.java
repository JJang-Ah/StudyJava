package Excercise;

public class Ex3_2 {

	public static void main(String[] args) {
		int score=85;
		String result = (!(score>90))?"��":"��";
		System.out.println(result);
		
		
		int amount=7;
		int price=5000;
		double rate=(amount>=10)?0.1:0.05;; //�������� ������ ����
		//���׿����� => ������ 10���̻��̸� ������10%, �̸��̸�5%
		int panme=(int)(amount*price*(1-rate));
		
		
				
		System.out.println("�Ǹűݾ�=" + panme);
		
		
		
		
	}

}
