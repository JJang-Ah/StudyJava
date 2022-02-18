package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
	
		List<String> list1 = Arrays.asList("È«±æµ¿", "±èÃ¶¼ö", "ÀÌ¿µÈñ");
		for(String name : list1) {
			System.out.println(name);
		}
		// ================================================================
		
		List<Integer> list2=Arrays.asList(80,90,77);
		for(int value : list2) {
			System.out.println(value);
		}
		
		
		
	}

}
