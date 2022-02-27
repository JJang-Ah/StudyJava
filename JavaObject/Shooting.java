package JavaObject;

public class Shooting {
//어노테이션 연계
	@PrintAnnotation
	public void shoot1() {
		System.out.println("기본 발사~");
	}
	
	@PrintAnnotation("★")
	public void shoot2() {
		System.out.println("별 발사~");
	}
	@PrintAnnotation(value = "＠", number = 30)
	public void shoot3() {
		System.out.println("무한 골뱅이 발사");
		
		
	}
	
}
