package Excercise;

import java.util.StringTokenizer;

public class SplitEx11 {

	public static void main(String[] args) {

		String str = "아이디,이름,패스워드";
		
		//방법1 (split() 메소드 이용)
		
		String[] tokens = str.split(",");
		for(String m : tokens) {
			System.out.println(m);
		}
		
		
		System.out.println();
		
		//방법2 (StringTokenizer 이용)
		
		StringTokenizer st = new StringTokenizer(str,",");
		int count =st.countTokens(); //분리된 개수를 count에 넣어준다.
		for(int i=0; i<count; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
	}

}
