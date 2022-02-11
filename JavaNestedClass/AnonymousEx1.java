package JavaNestedClass;

public class AnonymousEx1 {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();
		anony.ahhyun.wake();
		anony.method1();
		anony.method2(new Person() {
			void study1() {
				System.out.println("자바를 공ㄱ부 할끄야");
			}
			@Override
			void wake() {
				System.out.println("10시에 일어납니당");
				study1();
			}
		});
		
	}

}
