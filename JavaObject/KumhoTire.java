package JavaObject;

public class KumhoTire extends Tire{

	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "��ȣ Ÿ�̾��� ���� : " + (maxRotation-accumulatedRotation)+ "ȸ");
			return true;
			
		}else {
			System.out.println("***" + location + "��ȣ Ÿ�̾ ��ũ ***");
			return false;
		}
	}
	

}
