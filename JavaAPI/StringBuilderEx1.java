package JavaAPI;

public class StringBuilderEx1 {

	public static void main(String[] args) {

		
		//StringBuffer 클래스
		//StringBuilder 클래스
		StringBuilder sb = new StringBuilder();
		sb.append("korea ");
		sb.append("fighting");
		sb.append("!!");
		System.out.println(sb.toString());
		
		sb.insert(5, "n");
		System.out.println(sb);
		
		sb.setCharAt(4, 'p');
		System.out.println(sb);
		
		sb.replace(8, 9, "Hello");
		System.out.println(sb);
		
		sb.delete(2, 5);
		System.out.println(sb);
		
		
		//pattern 클래스 중요~!!!
		
	}

}
