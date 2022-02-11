package JavaNestedClass;

public class NestedStaticA {

	//static 정적 클래스
	
	static class NestedStaticB{
		
		int num1; //필드
		static int num2;
		
		public NestedStaticB() {
			
		}
		void method1() {
			System.out.println("내부 클래스의 인스턴스 메서드");
		}
		static void method2() {
			System.out.println("내부 클래스의 정적 메서드");
		}
	}
}
