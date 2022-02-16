package Excercise;

public class MemberAPI {

	//11장 연습문제
	
	private String id;
	private String name;
	
	public MemberAPI(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		String str;
		str = id + ":" + name;
		return str;
	}
}
