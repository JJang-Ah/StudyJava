package Excercise;

public class Parent {
 // 7장 연습문제
//	public String name;
//	
//	public Parent (String name) {
//		this.name = name;
//		
//	}
	
	public String nation;
	
	public Parent() {
		this("대한민국"); // >> 매개변수가 하나있는 생성자를 호출한다.
		System.out.println("Parent() call");
		
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
		
	}
}
