package javaObject;

//���� ���� Ŭ����

public class Account {
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
	void deposit (int amount) {	// void Ÿ��  , deposit << �޼ҵ� �� // void �̿��� Ÿ���� ���뿡�� return�� �ʿ��ϴ�. void�� �ʿ����� �ʴ�.
			//void�� ����ִ� �� ���ϰ��� ���� ������ ������.
		
		balance+=amount;
	}
	
	//����Ѵ�.
	int withdraw (int amount) {
		if(balance < amount) {
			return 0;
		}
		balance -= amount;
		return amount;	
	}
	
	
}
