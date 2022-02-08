package JavaObject;

public class PhysicalInfo {
	String name;
	int age;
	float height, weight; 	//여기까지 4개의 필드를 만듦
	
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name = name; //this를 쓰면 클래스의 필드를 의미한다.
		this.age = age; 
		this.height = height;
		this.weight = weight;
	}
	//같은 이름의 메소드를 여러개 선언하는 것을 메소드 오버로딩
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
