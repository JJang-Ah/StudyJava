package JavaInterface;
//������ �������̽�
public interface RemoteControl {
	
	// �������̽����� �ʵ�� ���� �Ұ��� ������
	// ��� �ʵ�� ���� ����
	public int MAX_VOLUME = 10; //�������̽������� ����� static final�� �ν�
	public int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	public void turnOn(); //�������̽� ���Ͽ����� �տ� abstract �Ƚᵵ �ȴ�. 
	public void turnOff(); // ������ �߻� �޼ҵ�� �ν��� �ֱ� �����̴�.
	public void setVolume(int volume);
	
	//����Ʈ �޼ҵ� // �ڹ�8 ���� ���� ���
	default void setMute (boolean mute) {
		if(mute) {
			System.out.println("���� ó�� �մϴ�.");
		}else {
			System.out.println("���� ����");
		}
	}
	
	//���� �޼ҵ� // �ڹ�8 ���� ���� ���
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
	
}
