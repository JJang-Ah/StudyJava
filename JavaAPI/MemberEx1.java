package JavaAPI;

public class MemberEx1 {
	
	public static void main(String[] args) {
		Member mem1 = new Member("kbs");
		Member mem2 = new Member("kbs");
		Member mem3 = new Member("mbc");
		if(mem1.equals(mem2)) {
			System.out.println("���� ID�� ������ �ֽ��ϴ�.");
		}else {
			System.out.println("�ٸ� ID�� ������ �ֽ��ϴ�.");
		}
		if(mem1.equals(mem3)) {
			System.out.println("���� ID�� ������ �ֽ��ϴ�.");
		}else {
			System.out.println("�ٸ� ID�� ������ �ֽ��ϴ�.");
		}
	}

}
