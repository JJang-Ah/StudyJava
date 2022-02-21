package JavaCollection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(60), "ȫ�浿");
		scores.put(new Integer(10), "��ö��");
		scores.put(new Integer(80), "�̿���");
		scores.put(new Integer(66), "�����");
		scores.put(new Integer(97), "�ܴ���");
		scores.put(new Integer(87), "��ö��");
		Map.Entry<Integer, String> entry = null;
		entry = scores.lastEntry(); //���� ����
		System.out.println("�ְ� ���� : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.firstEntry();
		System.out.println("���� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lowerEntry(new Integer(80));
		System.out.println("80�� �Ʒ� ���� : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.higherEntry(new Integer(60));
		System.out.println("60�� �� ���� : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.floorEntry(new Integer(60));
		System.out.println("60�� �̰ų� �ٷ� �Ʒ� ���� : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.ceilingEntry(new Integer(80)); 
		System.out.println("80�� �̰ų� �ٷ� �� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		while(!scores.isEmpty()) {
			entry=scores.pollFirstEntry(); //���� ��ü�� ������ ���� (scores�� ���� ���� ������ entry�� ����)
			System.out.println(entry.getKey() + " - " + entry.getValue() + " -- ���� ��ü �� : " + scores.size());
		}
		

	}

}
