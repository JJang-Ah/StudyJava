package JavaNestedClass;

public class NestedA { // 인스턴스 클래스 >> new로 생성해서 사용한다.
	int onum1;
	//중첩 클래스
	class NestedB {
		int num; //필드
		static int num2; //static 클래스가 아니라 불가능
		
		
		public NestedB() { //생성자
		}
		void method1() {
			System.out.println("메서드1 수행");
		}
	}
	
	void outMethod() { //외부 클래스의 메서드
		class NestedD { //로컬 클래스
			int num; //필드
			static int num2; //static 클래스가 아니라 불가능
			
			public NestedD() { //생성자
			}
			void method1() {
				System.out.println("메서드1 수행");
			}
		}
		
		NestedD nd1 = new NestedD();
		nd1.num = 50;
		nd1.method1();
	}
	
}
