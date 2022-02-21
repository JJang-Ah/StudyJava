package JavaCollection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx2 {

	public static void main(String[] args) {

		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(60), "ȫ�浿");
		scores.put(new Integer(10), "��ö��");
		scores.put(new Integer(80), "�̿���");
		scores.put(new Integer(66), "�����");
		scores.put(new Integer(97), "�ܴ���");
		scores.put(new Integer(87), "��ö��");
		
		NavigableMap<Integer, String> descMap = scores.descendingMap(); //���� ����
		Set<Map.Entry<Integer, String>> descSet = descMap.entrySet();
		for(Map.Entry<Integer, String> entry : descSet) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println("===============================================");
		
		NavigableMap<Integer, String> descMap2 = descMap.descendingMap();  //���������� �� ���������� �ؼ� ������������ ����
		Set<Map.Entry<Integer, String>> descSet2 = descMap2.entrySet();
		for(Map.Entry<Integer, String> entry : descSet2) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		
		
	}

}
