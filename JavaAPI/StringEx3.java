package JavaAPI;

public class StringEx3 {

	public static void main(String[] args) {
		String str = "���� ���� ����������";
		int pos = str.indexOf("����"); //.indexOf >> �迭���� �� ���ڸ� ã�� ��ġ�� �����ش�.
		System.out.println(pos);
		if(pos != -1) {
			System.out.println("������ ���õ� �̾߱� ����");
		}else {
			System.out.println("������ ������ �����ϴ�.");
		}
		
		System.out.println(str.length());
		
	}

}
