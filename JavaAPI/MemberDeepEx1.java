package JavaAPI;

public class MemberDeepEx1 {

	public static void main(String[] args) {

		MemberDeep original = new MemberDeep("ö��", 39, new int[]
				 {59, 70, 80}, new Car("�ҳ�Ÿ"));
		MemberDeep cloned = original.getMember();
		cloned.scores[1] = 90;
		cloned.car.model = "�׷���";
		
		System.out.println("���� ��ü");
		System.out.println("�̸� : " + original.name);
		System.out.println("���� : " + original.age);
		System.out.println("***����***");
		for(int i=0; i<original.scores.length; i++) {
			System.out.println((i+1) + "��° ���� ���� : " 
		+ original.scores[i]);
		}
		System.out.println("�� �� : " + original.car.model);
		
		System.out.println("================================");
		System.out.println("���� ��ü");
		System.out.println("�̸� : " + cloned.name);
		System.out.println("���� : " + cloned.age);
		System.out.println("***����***");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.println((i+1) + "��° ���� ���� : " 
		+ cloned.scores[i]);
		}
		System.out.println("�� �� : " + cloned.car.model);
	}

}
