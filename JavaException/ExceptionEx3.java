package JavaException;

public class ExceptionEx3 {

	public static void main(String[] args) {
	
		
		String str1 = "100";
		String str2 = "200";
		System.out.println(str1+str2);
		System.out.println(Integer.parseInt(str1) +Integer.parseInt(str2));
		//Intiger.parsInt >> ���� ���ڿ��� ���������� �ν��ϰ� ���ش�.
		
		String str3 = "��100";
		String str4 = "200";
		try {
			System.out.println(Integer.parseInt(str3) +Integer.parseInt(str4));
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("���ڷ� ��ȯ �Ұ���~");
		}finally { //finally�� ������ �յ� ���� �׻� ����
			System.out.println("������~~!");
		}
		
		
	}

}
