package JavaNestedClass;
//�͸� Ŭ����
public class Anonymous {
	//�ʵ� �ʱⰪ
	Person ahhyun = new Person() {
		void work() {
			System.out.println("���� ��� �Ϸ�����");
		}
		
		@Override
		void wake() {
			System.out.println("6�� ����Ѵ�.~");
			work();
		}
	};
	
	void method1() {
		//���� ������ ����
		Person gildong = new Person(){
			void work() {
				System.out.println("���� ��� �Ϸ�����");
			}
			
			@Override
			void wake() {
				System.out.println("8�� ����Ѵ�.~");
				work();
			}
		};
		
		//���� ���� ���
		gildong.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
	
	
}
