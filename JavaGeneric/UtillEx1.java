package JavaGeneric;

public class UtillEx1 {

	public static void main(String[] args) {
		//Á¦³×¸¯ ¸Þ¼­µå È£Ãâ
		Box<Integer> box1 = Utill.<Integer>boxing(100); 
		int value = box1.get();
		
		Box<String> box2 = Utill.boxing("Ã¶¼öÃ¶¼ö±èÃ¶¼ö");
		String str = box2.get();
		
		
		
	}

}
