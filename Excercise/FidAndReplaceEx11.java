package Excercise;

public class FidAndReplaceEx11 {

	public static void main(String[] args) {

		String str = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index = str.indexOf("�ڹ�"); //�ڹٶ� ���� ó������ �߰ߵ� ��ġ���� ���Ϲ޴´�.
		if(index == -1) { //��ã���� -1�� ���ϵȴ�.
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
			
		}else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
			str = str.replace("�ڹ�", "Java");
			System.out.println("->" + str);
		}
	}

}
