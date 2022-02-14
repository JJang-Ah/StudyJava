package JavaAPI;

public class StringEx1 {

	public static void main(String[] args) {

		byte[] b = {65,77,4,46,54,25,73};
		
		String str1 = new String(b);
		System.out.println(str1);
		String str2 = new String(b,1,3); //b라는 배열에서 1번째부터 3개의 값을 가져온다는 뜻
		System.out.println(str2);
	}
}
