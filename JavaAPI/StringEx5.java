package JavaAPI;

public class StringEx5 {

	public static void main(String[] args) {

		String oldStr = "korea ������ !! korea ������~";
		String newStr = oldStr.replace("korea", "���ѹα�");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String str="computer";
		String subStr1 = str.substring(5); //5�迭���� ������ �����´�
		System.out.println(subStr1);
		
		String subStr2=str.substring(2, 5);//2���� 5������ �����´�
		System.out.println(subStr2);
		
	}

}
