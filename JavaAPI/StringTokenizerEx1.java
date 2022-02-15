package JavaAPI;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {

		String text = "홍길동, 김철수, 이영희, 박찬호, 이동국";
		StringTokenizer st = new StringTokenizer(text,",");
		//new StringTokenizer(text); 구분자없이 쓰면 공백을 구분자로 이용한다.

		int count = st.countTokens(); //분리된 토큰의 수를 정수값으로 돌려준다.
		System.out.println(count);
		
		for(int i=0; i<count; i++){
			String name=st.nextToken();//분리된 토큰을 기점으로 나누어 준다.
			System.out.println(name);
		}
		
	}

}
