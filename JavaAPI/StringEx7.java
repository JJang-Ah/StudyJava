package JavaAPI;

public class StringEx7 {

	public static void main(String[] args) {

		String origin = "Java Programming";
		String lower = origin.toLowerCase();//��� �ҹ��ڷ� ������ش�.
		System.out.println(lower); 
		String upper = origin.toUpperCase(); // ��� �빮�ڷ� ������ش�.
		System.out.println(upper);
		
		String str1 = "Java Programming";
		String str2 = "JAVA PROGRAMMING";
		if(str1.toUpperCase().equals(str2)) {
			System.out.println("���� �����Դϴ�.");
		}else {
			System.out.println("�ٸ� �����Դϴ�.");
		}
	}

}
