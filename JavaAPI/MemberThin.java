package JavaAPI;

public class MemberThin implements Cloneable{ 
	//�������̽� Cloneable > �Ⱦ��� ���� ��� ���Ѵٴ� ��

	//��ü ���� (clone())
	
	//1. ���� ���� (thin clone) - ������ �ּҰ� ����
	// �⺻Ÿ���϶� �� ����
	// ����Ÿ���϶� ��ü�� �ּ�(����)�� ����
	//2. ���� ���� (deep clone) - ��ü ��ü ����
	
	//���� ����
	
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	
	
	public MemberThin(String id, String name, String password,
			int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;	
	}
	
	public MemberThin getMember() { 
		MemberThin cloned = null;
		try {//clone�� ���ܸ� �ǹ������� �䱸�Ѵ�
			cloned = (MemberThin)clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return cloned;
		
	}
	
	

}
