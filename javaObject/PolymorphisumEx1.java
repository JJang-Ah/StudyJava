package JavaObject;

public class PolymorphisumEx1 { //������
	

	public static void main(String[] args) {
		Account obj1 = new Account();
		obj1.deposit(10000);
		CheckingAccount obj2 = new CheckingAccount();
		Account obj3 = new CheckingAccount(); //Ÿ���� ������ ���� �ٸ� ��ü�� ���� �� �ִ�.
		Account obj4 = new CreditLineAccount();
		castProcess(obj3);
		castProcess(obj1);
		castProcess(obj4);
		//���� ĳ����
		try {
		CheckingAccount obj5 = (CheckingAccount) obj1;
		System.out.println("��ȯ ����!");
		}catch(ClassCastException e){
			System.out.println("��ȯ ����~");
			
		}
		try {
			CheckingAccount obj5 = (CheckingAccount) obj3;
			System.out.println("��ȯ ����!");
			}catch(ClassCastException e){
				System.out.println("��ȯ ����~");
				
			}		
	}
	public static void castProcess(Account acc) {
		if(acc instanceof CheckingAccount) {
			CheckingAccount obj5 = (CheckingAccount)acc;
			System.out.println("�� �ν��Ͻ� �³� �׷��� ĳ���� �ߴ�");
		}else {
			System.out.println("ĳ���� ���Ѵ�.");
		}
	}

}
