package JavaInterface;

public class iMonkey extends Animal implements iAnimal{

	//Animal�� ��ӹް� interface�� iAnimal�� ����Ͽ�
	// ���߻�� ����ϰ� �� ���ִ�.
	
	@Override
	public void eat() {
		System.out.println("�ٳ����� �Դ���");
		
	}

	@Override
	void move() {
		System.out.println("�ι߷� �̵� �Ѵ�...!");
		
	}

	@Override
	public void sleep() {
		
	}
	
	
	

}
