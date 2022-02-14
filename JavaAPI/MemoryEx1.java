package JavaAPI;

public class MemoryEx1 {

	public static void main(String[] args) {
		Book book = null;
		
		for(int i=1; i<=50; i++) {
			book = new Book(i);
			book = null; //힙에는 자료가 있지만 주소를 없앤다는 명령
			System.gc(); 
			//가비지컬렉션 : 쓰레기 수집기 >> null값으로 연결되지않는 객체를 삭제
		}
		
	}
	
	

}
