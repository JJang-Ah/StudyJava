package JavaGeneric;

public class UtillEx1 {

	public static void main(String[] args) {
		//���׸� �޼��� ȣ��
		Box<Integer> box1 = Utill.<Integer>boxing(100); 
		int value = box1.get();
		
		Box<String> box2 = Utill.boxing("ö��ö����ö��");
		String str = box2.get();
		
		
		
	}

}
