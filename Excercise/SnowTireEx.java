package Excercise;

public class SnowTireEx {

	public static void main(String[] args) {

		//7�� ��������
		
		SnowTire snowTire = new SnowTire(); //��ü ���� (�ν��Ͻ�ȭ)
		Tire tire = snowTire; //�̰� ������ �̶�� �Ѵ�. //�θ����� �ڽ��� ���� �ڵ�����ȯ�� �Ǿ���
		
		tire.run();
		snowTire.run();
		
	}

}
