package JavaAPI;

import java.util.HashMap;

public class KeyEx1 {

	public static void main(String[] args) {

		HashMap<Key, String> hMap = new HashMap<Key, String>();
		hMap.put(new Key(5), "�浿�浿��浿");
		String value = hMap.get(new Key(5));
		System.out.println(value);
	}

}
