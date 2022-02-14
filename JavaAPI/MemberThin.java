package JavaAPI;

public class MemberThin implements Cloneable{ 
	//인터페이스 Cloneable > 안쓰면 복제 허용 안한다는 뜻

	//객체 복제 (clone())
	
	//1. 얕은 복제 (thin clone) - 참조할 주소가 복제
	// 기본타입일때 값 복사
	// 참조타입일때 객체의 주소(번지)가 복제
	//2. 깊은 복제 (deep clone) - 객체 자체 복제
	
	//얕은 복제
	
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	
	
	public MemberThin(String id, String name, String password,
			int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;	
	}
	
	public MemberThin getMember() { 
		MemberThin cloned = null;
		try {//clone은 예외를 의무적으로 요구한다
			cloned = (MemberThin)clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return cloned;
		
	}
	
	

}
