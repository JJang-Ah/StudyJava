package JavaCollection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {

		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("ȫ�浿", 133); //Map �� .put ���� �ڷḦ ����ִ´�.
		
		map.put("��ö��", 90);
		map.put("��¯��", 30);
		map.put("����", 12);
		map.put("�ͱ�", 88);
		
		map.remove("��ö��"); //���� �Ҷ����� Ű���� �Է��ϸ� �ȴ�.
		
		System.out.println("�ڷ� ���� : " + map.size());
		System.out.println(map.get("ȫ�浿")); // .get ���� Ű�� �Է��Ͽ� ���� ����Ѵ�.
		//����ϴ� ���
		// 1. KeySet Ȱ��
		System.out.println("**���� ����Ʈ**");
		for(String name : map.keySet()) {
			System.out.println("[�̸�]" + name + " / [����] : " + map.get(name));	
		}
		// 2. entrySet Ȱ�� - ����!!
		System.out.println("**���� ����Ʈ**");
		for(java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("�̸� : " + entry.getKey() + 
					" / ���� : " +entry.getValue());
		}
		
		
		
		
		
		
		
		
	}

}
