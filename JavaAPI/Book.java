package JavaAPI;

public class Book {

	private int no;
	public Book(int no) {
		this.no=no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		//객체 소멸자
		//객체를 소멸하기 직전에 실행되는 메서드
		System.out.println(no + "번 객체의 finalize()가 실행되었습니다.");
	}
	
	
}
