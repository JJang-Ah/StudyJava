package Excercise;

public class MemberServiceEx1 {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result=memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("�α��� �ϼ˽���.��");
		}

	}

}
