package JavaObject;

public class HyundaiCar {
//	
//	Tire frontLeftTire = new HankookTire("�� ����", 6);
//	Tire frontRightTire = new HankookTire("�� ������", 2);
//	Tire backLeftTire = new KumhoTire("�� ����", 3);
//	Tire backRightTire = new KumhoTire("�� ������", 5);
	//�� �ڵ���� �迭�� �����
	Tire[] tires = {
			new Tire("�� ����", 2),
			new Tire("�� ������", 3),
			new Tire("�� ����", 4),
			new Tire("�� ������", 6),
			};
	
	
	//�޼ҵ�
	int run() {
		System.out.println("�ڵ����� �θ��θ�");
		for( int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i+1);
				}
			}
		return 0;
		}
	
//		if(frontLeftTire.roll() == false) {
//			System.out.println("�� ���� ������ ����");
//			stop();
//			return 1; //Ÿ�̾��� ��ȣ
//		}
//		if(frontRightTire.roll() == false) {
//			System.out.println("�� ������ ������ ����");
//			stop();
//			return 2; //Ÿ�̾��� ��ȣ
//		}
//		if(backLeftTire.roll() == false) {
//			System.out.println("�� ���� ������ ����");
//			stop();
//			return 3; //Ÿ�̾��� ��ȣ
//		}
//		if(backRightTire.roll() == false) {
//			System.out.println("�� ������ ������ ����");
//			stop();
//			return 4; //Ÿ�̾��� ��ȣ
//		}
//		return 0;
		 
		// �� �ڵ带 �Ʒ��� ���� �� �ִ�.
		
	
	void stop() {
		System.out.println("�ڵ����� �����!!");
		
		
	}
}
