package Excercise;

public class Child extends Parent{
	//7장 연습문제

//	private int studentNo;
//	
//	public Child(String name, int studentNo) {
////		this.name = name; //이렇게 하면 에러가 난다.
//		super(name);
//		this.studentNo = studentNo;
//		
//	}
	
	
	
	private String name;
	public Child() {
		this("홍길동"); // this.~ > 하나의 값 호출 /this(~) > ~의 갯수만큼의 매개변수를 갖는 생성자 호출
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
