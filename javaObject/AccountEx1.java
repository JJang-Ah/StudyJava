package javaObject;

public class AccountEx1 {

	public static void main(String[] args) {	//���� �޼ҵ�� �ڹٰ� ���� ���� �����ϴ� �޼���
		Account chulsu; //��ü ���� ����
		chulsu=new Account(); //��ü ���� (�ν��Ͻ�ȭ)
		//int num1; �Ϲ� ����
		//Account chulsu; //��ü ����
		int amount = 0; //�ݾ��� ��� ����
		
		chulsu.accountNo = "123-456-123456"; //accountNo - �ʵ�, ~() << ��ȣ�������� �޼ҵ� ������ �ʵ� // �ʵ�� ��ü�� ����Ǵ°�
		chulsu.ownerName = "ö��ö����ö��";
		chulsu.balance = 150000;
		
		Account gildong=new Account(); //��ü ���� (�ν��Ͻ�ȭ
		gildong.accountNo="111-222-333444";
		gildong.ownerName= "�浿�浿ȫ�浿";
		gildong.balance= 100000;
		
		chulsu.deposit(3000);
		System.out.println(chulsu.balance);
		gildong.deposit(10000);
		System.out.println(gildong.balance);
		try {
			amount=gildong.withdraw(40000);
			gildong.withdraw(39999999);
			System.out.println(gildong.balance);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
			System.out.println("������ �̸� : " + chulsu.ownerName);
			System.out.println("�ܾ� : " + chulsu.balance);
			System.out.println("==================================");
			System.out.println("������ �̸� : " + gildong.ownerName);
			System.out.println("ã�� �ݾ� " + amount);
			System.out.println("�ܾ� : " + gildong.balance);
		
		
	}

}
