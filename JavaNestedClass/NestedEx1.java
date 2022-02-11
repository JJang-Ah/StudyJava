package JavaNestedClass;

public class NestedEx1 {

	public static void main(String[] args) {

		NestedA na = new NestedA(); //외부 클래스 인스턴스 객체 생성
		NestedA.NestedB nb = na.new NestedB(); // 내부 클래스 인스턴스 객체생성
		nb.num=50; //내부 클래스 필드 접근
		nb.method1(); // 내부 클래스 메서드 수행
		
		
	}

}
