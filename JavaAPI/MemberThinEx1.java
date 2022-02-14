package JavaAPI;

public class MemberThinEx1 {

	public static void main(String[] args) {
		MemberThin original = new MemberThin("gil", 
				"길동", "123123", 30, true);
		MemberThin cloned = original.getMember();
		
		original.name = "영희";
		
		System.out.println("원본 객체");
		System.out.println("아이디 : " + original.id);
		System.out.println("이름 : " + original.name);
		System.out.println("나이 : " + original.age);
		System.out.println("성인 : " + original.adult);
		
		System.out.println("======================");
		System.out.println("복제 객체");
		System.out.println("아이디 : " + cloned.id);
		System.out.println("이름 : " + cloned.name);
		System.out.println("나이 : " + cloned.age);
		System.out.println("성인 : " + cloned.adult);
				

	}

}
