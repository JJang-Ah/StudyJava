package JavaInterface;

public class VehicleEx1 {

	public static void main(String[] args) {

		Vehicle vehicle = new Bus(); //Ŭ���� �Ӹ� �ƴ϶� �������̽��� ���������ִ�.
		vehicle.run();
//		vehicle.checkFare(); //�̰� �ȵȴ�. ������ vehicle�� �ޱ⶧��
		
		//�ڽ� > �θ� �ڵ� ����ȯ�� ������
		// �θ� > �ڽ� ��������ȯ �ؾ��Ѵ�
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
		
	}

}
