package JavaObject;

public class HyndaiCarEx {

	public static void main(String[] args) {

		HyundaiCar chulsuCar = new HyundaiCar(); //HyundaiCar Ŭ������ �ν��Ͻ� ��ü ����
		
		for(int i=1; i<=5; i++) {
			int problemLocation = chulsuCar.run();
			if(problemLocation != 0) {
				System.out.println(chulsuCar.tires[problemLocation-1].location +
						"�ѱ� Ÿ�̾�� ��ü");
				chulsuCar.tires[problemLocation-1]=new HankookTire(chulsuCar.tires[problemLocation-1].location,15);
			}
			
			
			
//			switch(problemLocation) {
//			case 1:
//				System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
//				chulsuCar.frontLeftTire = new HankookTire("�� ����", 15);
//				break;
//			case 2:
//				System.out.println("�� ������ ��ȣŸ�̾�� ��ü");
//				chulsuCar.frontRightTire = new KumhoTire("�� ������", 7);
//				break;
//			case 3:
//				System.out.println("�� ���� ��ȣŸ�̾�� ��ü");
//				chulsuCar.backLeftTire = new KumhoTire("�� ����", 7);
//				break;
//			case 4:
//				System.out.println("�� ������ �ѱ�Ÿ�̾�� ��ü");
//				chulsuCar.backRightTire = new HankookTire("�� ������", 15);
//				break;
//			}
			System.out.println("=====================================");
		}
	}

}
