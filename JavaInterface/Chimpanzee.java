package JavaInterface;

public class Chimpanzee implements AniLang{

	@Override
	public void eat() {
		System.out.println("�ٳ����� �Խ��ϴ�.");
	}

	@Override
	public void sleep() {
		System.out.println("�������� ��ϴ�");
		
	}

	@Override
	public void talk() {
		System.out.println("��ȣ��ȣ ��ȭ�� �����ϴ�.");
		
	}

	@Override
	public void group() {
		System.out.println("����� �ѳ��� �߽����� ������ �����ϴ�.");
		
	}
	

}
