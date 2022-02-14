package JavaAPI;

public class StringEx5 {

	public static void main(String[] args) {

		String oldStr = "korea 파이팅 !! korea 만쉐이~";
		String newStr = oldStr.replace("korea", "대한민국");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String str="computer";
		String subStr1 = str.substring(5); //5배열부터 끝까지 가져온다
		System.out.println(subStr1);
		
		String subStr2=str.substring(2, 5);//2부터 5전까지 가져온다
		System.out.println(subStr2);
		
	}

}
