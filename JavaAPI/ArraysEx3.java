package JavaAPI;

import java.util.Scanner;

public class ArraysEx3 {

	public static void main(String[] args) {

		int[] scores = {80,78,56,97,81};
		String[] names = {"����ȣ","ȫ�浿","��ö��","����","��浿"};
		int searchScore = 97;
		Scanner sc = new Scanner(System.in);
		System.out.print(" �̸��� �Է��ϼ��� > ");
		String searchname = sc.next();
		
		int i;
		for(i=0;i<scores.length;i++) {
			if(names[i].equals(searchname)) {
				System.out.println("����� ������ : " + scores[i]);
				break;
			}	
		}
		if(i==scores.length) {
				System.out.println("��ܿ� �ش��ϴ� �̸��� �����ϴ�.");
			}
		
	}

}
