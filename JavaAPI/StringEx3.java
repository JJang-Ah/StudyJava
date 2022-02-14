package JavaAPI;

public class StringEx3 {

	public static void main(String[] args) {
		String str = "오늘 날씨 베리베리굿";
		int pos = str.indexOf("날씨"); //.indexOf >> 배열에서 그 문자를 찾은 위치를 돌랴준다.
		System.out.println(pos);
		if(pos != -1) {
			System.out.println("날씨와 관련된 이야기 군요");
		}else {
			System.out.println("날씨와 관련이 없습니다.");
		}
		
		System.out.println(str.length());
		
	}

}
