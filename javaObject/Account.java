package JavaObject;

//���� ���� Ŭ����

public class Account {
	static String bankName="��������"; //static > �ν��Ͻ��� �ƴ϶� Ŭ������ �Ҽӵ� ��ü
	static final String home="��⵵";
	//�ʵ�(Field) - ��ü�� �����Ͱ� ����Ǵ� ��
	String accountNo; //���¹�ȣ
	String ownerName; //������ �̸�
	int balance; //�ܾ�
	//������(Constructor) - ��ü ������ �ʱ�ȭ ���� ��� //197p
	public Account(String accountNo, String ownerNa, int bal) { //��Ʈ�� �����̽��� �����ؼ� �� �����ڿ� �ʵ忡�� ���� ������ �����´�.
		this.accountNo=accountNo; // �Ű������� �ʵ� �̸��� ���� �Ϸ��� �̷��� �� ���ִ�. //�̸� �����ϱ� ���� this
		ownerName=ownerNa; // ������ �̷��� �Ű������� �ʵ��̸��� ������ �ξ� ���� ������ �ְ� �����.
		balance=bal;
	}
	
	//�⺻ ������(Default Constructor
	//�⺻ �����ڸ� ����� ��ü�� �Ű� ������ �Է������ʾƵ� �� �ν��Ͻ��� ���������.
	
	
	public Account() {
	}
	
	//�޼��� (Method) - ��ü�� ����
	
	//�����Ѵ�.
	public void deposit (int amount) {	// void Ÿ��  , deposit << �޼ҵ� �� // void �̿��� Ÿ���� ���뿡�� return�� �ʿ��ϴ�. void�� �ʿ����� �ʴ�.
			//void�� ����ִ� �� ���ϰ��� ���� ������ ������.
		
		balance+=amount;
	}
	
	//����Ѵ�.
	public int withdraw (int amount) throws BalanceLackException{ //������ exception >> ���� ���ѱ��
		if(balance < amount) {
			throw new BalanceLackException("�ܾ��� �����մϴ�. (" + (amount - balance) +"�� ���ڶ�)");
		}
		balance -= amount;
		return amount;	
	}
	
	
}
