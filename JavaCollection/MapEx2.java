package JavaCollection;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {

	public static void main(String[] args) {

		
		
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(12345, "ȫ�浿"), 99);
		map.put(new Student(11111, "��ö��"), 79);
		map.put(new Student(22222, "��¯��"), 34);
		map.put(new Student(33333, "�ͱ�"), 59);
		map.put(new Student(11111, "��ö��"), 19);
		
		System.out.println("�� ������ �� : " + map.size());
		
		
		
	}

}
