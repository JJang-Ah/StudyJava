package JavaObject;

public class Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	//������
	public Car() {
		this("�ڰ���","����",220); //this () �ٸ� �����ڸ� ȣ���� ���ִ�
	}
	
	public Car(String model) {
		this(model, "����", 220);
		
	}
	public Car(String model, String color) {
		this.model=model;
		this.color=color;
		this.maxSpeed=220;
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	
}
