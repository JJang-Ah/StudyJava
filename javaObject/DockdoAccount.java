package JavaObject;

public class DockdoAccount {

	public static void main(String[] args) {

		DokdoAccount younghee = new DokdoAccount("111-111-111111", "���ǿ������", 200000);
		younghee.deposit(30000);
		System.out.println("�ܾ� : " + younghee.balance);
		System.out.println("���� ����Ʈ : " + younghee.point);
		
		
		
	}
}
