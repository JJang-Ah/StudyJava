package Excercise;

import java.util.regex.Pattern;

public class PatternMatcherEx11 {

	public static void main(String[] args) {
		//11�� ��������
		
		//ù ��°�� ���ĺ����� �����ϰ� �ι�°���� ���ڿ� ���ĺ����� ������ 
		// 8~12�� ������ id������ �˻��ϱ�
		
		String id ="Angel1004";
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID�� ����� �� �ֽ��ϴ�.");
		}else {
			System.out.println("ID�� ��� ���ؿ�~~~!");
		}
	}

}
