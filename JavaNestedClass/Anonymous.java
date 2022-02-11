package JavaNestedClass;
//익명 클래스
public class Anonymous {
	//필드 초기값
	Person ahhyun = new Person() {
		void work() {
			System.out.println("아으 출근 하러간다");
		}
		
		@Override
		void wake() {
			System.out.println("6시 기상한다.~");
			work();
		}
	};
	
	void method1() {
		//로컬 변수값 대입
		Person gildong = new Person(){
			void work() {
				System.out.println("아으 출근 하러간다");
			}
			
			@Override
			void wake() {
				System.out.println("8시 기상한다.~");
				work();
			}
		};
		
		//로컬 변수 사용
		gildong.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
	
	
}
