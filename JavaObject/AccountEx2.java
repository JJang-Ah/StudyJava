package JavaObject;


public class AccountEx2 {

	public static void main(String[] args) {
		Account younghee=new Account("333-222-111222", "�������̿���", 100000);
		younghee.deposit(20000);
		younghee.bankName = "��������"; //���� �مf���� ��ȣ�� ���൵ �ٲ��.
				// ��ü�� �������� �ʴ� ������ static �̱� ����
//		younghee.home="����"; // static final �̶� �ٲ� ������.
		try {
			younghee.withdraw(50000);
		}catch(BalanceLackException e) {
			System.out.println(e.getMessage());
		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		Account chanho = new Account("123-123-123123","��ȣ��ȣ����ȣ", 0);
		chanho.deposit(45000);
		try {
			chanho.withdraw(130000);	
		} catch (Exception e) {
			System.out.println(e);
		}
		
		printAccount(younghee);
		printAccount(chanho);
		printAccount(new Account("123-123", "���͸�", 101000));
		
			
	}
	
	//���� �ڷ� ��� �޼���
	static void printAccount(Account obj) {
		System.out.println("�ŷ����� : " + Account.bankName); //Account Ŭ������ ���� ��ü?
		System.out.println("�ŷ����� : " + obj.bankName);
		System.out.println("��ġ : " + obj.home);
		System.out.println("���� ��ȣ : " + obj.accountNo);
		System.out.println("������ : " + obj.ownerName);
		System.out.println("���� �ܾ� : "+ obj.balance);
		System.out.println("===========================");	
	}
	

}
