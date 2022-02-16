package Excercise;

import java.util.StringTokenizer;

public class SplitEx11 {

	public static void main(String[] args) {

		String str = "���̵�,�̸�,�н�����";
		
		//���1 (split() �޼ҵ� �̿�)
		
		String[] tokens = str.split(",");
		for(String m : tokens) {
			System.out.println(m);
		}
		
		
		System.out.println();
		
		//���2 (StringTokenizer �̿�)
		
		StringTokenizer st = new StringTokenizer(str,",");
		int count =st.countTokens(); //�и��� ������ count�� �־��ش�.
		for(int i=0; i<count; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
	}

}
