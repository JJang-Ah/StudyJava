package JavaAPI;

public class MemberThinEx1 {

	public static void main(String[] args) {
		MemberThin original = new MemberThin("gil", 
				"�浿", "123123", 30, true);
		MemberThin cloned = original.getMember();
		
		original.name = "����";
		
		System.out.println("���� ��ü");
		System.out.println("���̵� : " + original.id);
		System.out.println("�̸� : " + original.name);
		System.out.println("���� : " + original.age);
		System.out.println("���� : " + original.adult);
		
		System.out.println("======================");
		System.out.println("���� ��ü");
		System.out.println("���̵� : " + cloned.id);
		System.out.println("�̸� : " + cloned.name);
		System.out.println("���� : " + cloned.age);
		System.out.println("���� : " + cloned.adult);
				

	}

}
