package JavaCollection;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {

	public static void main(String[] args) {

		
		
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(12345, "È«±æµ¿"), 99);
		map.put(new Student(11111, "±èÃ¶¼ö"), 79);
		map.put(new Student(22222, "½ÅÂ¯±¸"), 34);
		map.put(new Student(33333, "¸Í±¸"), 59);
		map.put(new Student(11111, "±èÃ¶¼ö"), 19);
		
		System.out.println("ÃÑ ÀÀ½ÃÀÚ ¼ö : " + map.size());
		
		
		
	}

}
