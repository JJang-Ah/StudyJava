package JavaObject;

public class PhysicalInfo {
	String name;
	int age;
	float height, weight; 	//������� 4���� �ʵ带 ����
	
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name = name; //this�� ���� Ŭ������ �ʵ带 �ǹ��Ѵ�.
		this.age = age; 
		this.height = height;
		this.weight = weight;
	}
	//���� �̸��� �޼ҵ带 ������ �����ϴ� ���� �޼ҵ� �����ε�
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;		
	}
	void update(int age, float height) {
		this.age=age;
		this.height=height;
	}
	void update(int age) {
		this.age=age;
	}
	
}
