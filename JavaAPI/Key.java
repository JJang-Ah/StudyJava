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
	public int hashCode() { //두개의 new Key(5)이 같은 값을 갖게된다.
		return number;
	}
}
