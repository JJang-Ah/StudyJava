package JavaNestedClass;

public class AnonymousEx1 {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();
		anony.ahhyun.wake();
		anony.method1();
		anony.method2(new Person() {
			void study1() {
				System.out.println("�ڹٸ� ������ �Ҳ���");
			}
			@Override
			void wake() {
				System.out.println("10�ÿ� �Ͼ�ϴ�");
				study1();
			}
		});
		
	}

}
