package JavaAPI;

public class MemberEx1 {
	
	public static void main(String[] args) {
		Member mem1 = new Member("kbs");
		Member mem2 = new Member("kbs");
		Member mem3 = new Member("mbc");
		if(mem1.equals(mem2)) {
			System.out.println("같은 ID를 가지고 있습니다.");
		}else {
			System.out.println("다른 ID를 가지고 있습니다.");
		}
		if(mem1.equals(mem3)) {
			System.out.println("같은 ID를 가지고 있습니다.");
		}else {
			System.out.println("다른 ID를 가지고 있습니다.");
		}
	}

}
