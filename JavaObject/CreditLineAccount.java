package JavaObject;

public class CreditLineAccount extends Account { //JAVA�� ����� �ϳ��� ���� �� �ִ�. �ٸ����ʹ� �޸� ���߻�� ������� �ʴ´�.
	 //���� ����� �ȴٸ� �����̸��� �޼ҵ��� �θ� �������� �˼����� �����̴�.
	int creditLine; //���̳ʽ� �ѵ�
	//������ 
	
	public CreditLineAccount(String accountNo, String ownerName, int balance,
			 int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	public CreditLineAccount() {
	}
	//�޼ҵ� ������ : (override) - �������̵� >> ���� ���δ�.!
	//�޼ҵ带 �����ؼ� ����Ѵ�. 
	@Override // << ������̼� // ��� �޼ҵ尡 �ڽ� Ŭ�������� �������̵� �Ǿ����� �˰� ���ش�. >�����Ϸ����� ���� üũ�� �ϵ��� �˸���.
	public int withdraw(int amount) throws BalanceLackException{ //override �ص� �ȿ� ���븸 ���������ϰ� ���� ������ �� ����.
		if((balance+creditLine) < amount) {
			throw new BalanceLackException ("����� �Ұ� �մϴ�.");
		}
	
	balance -= amount;
	return amount;
	}
	
}
