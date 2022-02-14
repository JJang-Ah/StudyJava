package JavaAPI;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key cKey = (Key)obj;
			if(this.number==cKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() { //�ΰ��� new Key(5)�� ���� ���� ���Եȴ�.
		return number;
	}
}
