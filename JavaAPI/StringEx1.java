package JavaAPI;

public class StringEx1 {

	public static void main(String[] args) {

		byte[] b = {65,77,4,46,54,25,73};
		
		String str1 = new String(b);
		System.out.println(str1);
		String str2 = new String(b,1,3); //b��� �迭���� 1��°���� 3���� ���� �����´ٴ� ��
		System.out.println(str2);
	}
}
