package JavaNestedClass;

public class NestedStaticA {

	//static ���� Ŭ����
	
	static class NestedStaticB{
		
		int num1; //�ʵ�
		static int num2;
		
		public NestedStaticB() {
			
		}
		void method1() {
			System.out.println("���� Ŭ������ �ν��Ͻ� �޼���");
		}
		static void method2() {
			System.out.println("���� Ŭ������ ���� �޼���");
		}
	}
}
