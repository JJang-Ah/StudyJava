package JavaObject;

public class Tire {

	
	//�ʵ�
	public int maxRotation; //�ִ� ȸ���� (Ÿ�̾� ����)
	public int accumulatedRotation; //���� ȸ����
	public String location; //Ÿ�̾��� ��ġ
	
	//������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼���
	public boolean roll() {
		accumulatedRotation ++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Ÿ�̾��� ����"+ (maxRotation - accumulatedRotation) + "ȸ");			
			return true;
		}else {
			System.out.println(location + "Ÿ�̾� ������ ���߽��ϴ�.");
			return false;
		}
		
	}
	
	
	
}
