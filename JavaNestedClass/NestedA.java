package JavaNestedClass;

public class NestedA { // �ν��Ͻ� Ŭ���� >> new�� �����ؼ� ����Ѵ�.
	int onum1;
	//��ø Ŭ����
	class NestedB {
		int num; //�ʵ�
		static int num2; //static Ŭ������ �ƴ϶� �Ұ���
		
		
		public NestedB() { //������
		}
		void method1() {
			System.out.println("�޼���1 ����");
		}
	}
	
	void outMethod() { //�ܺ� Ŭ������ �޼���
		class NestedD { //���� Ŭ����
			int num; //�ʵ�
			static int num2; //static Ŭ������ �ƴ϶� �Ұ���
			
			public NestedD() { //������
			}
			void method1() {
				System.out.println("�޼���1 ����");
			}
		}
		
		NestedD nd1 = new NestedD();
		nd1.num = 50;
		nd1.method1();
	}
	
}
