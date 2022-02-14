package JavaAPI;

public class StringEx7 {

	public static void main(String[] args) {

		String origin = "Java Programming";
		String lower = origin.toLowerCase();//모두 소문자로 만들어준다.
		System.out.println(lower); 
		String upper = origin.toUpperCase(); // 모두 대문자로 만들어준다.
		System.out.println(upper);
		
		String str1 = "Java Programming";
		String str2 = "JAVA PROGRAMMING";
		if(str1.toUpperCase().equals(str2)) {
			System.out.println("같은 문자입니다.");
		}else {
			System.out.println("다른 문자입니다.");
		}
	}

}
