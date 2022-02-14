package JavaAPI;

public class Member {

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() { //��ü �ؽ��ڵ� - ��ü�� �ĺ��� �ڵ�
		return id.hashCode();
	}
	
}

