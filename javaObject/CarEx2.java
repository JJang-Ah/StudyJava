package javaObject;

public class CarEx2 {

	public static void main(String[] args) {

		Car chulsuCar = new Car();
		printCar(chulsuCar);
		Car younheeCar = new Car("�ý�");
		printCar(younheeCar);
	}
	
	
	
	
	
	//�ڵ��� ���� ��� �޼���
	//static < �����̴ٶ�� �ǹ�
	static void printCar(Car obj) {
		System.out.println("company : " + obj.company);
		System.out.println("model : " + obj.model);
		System.out.println("color : " + obj.color);
		System.out.println("maxSpeed : " + obj.maxSpeed);
		System.out.println("===============================");
		
	}

}
