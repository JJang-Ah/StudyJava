package JavaLambda;

public class ClassLambda {
	
	public int age = 25;
	
	class InnerClass {
		int date = 30;
		
		void inmethod1() {
			MyFunctionIneterface myfunc = new MyFunctionIneterface() {
				int age =10;
				@Override
				public int method1(int amount, int price) {
					System.out.println("���� ���� : " +age); 
					// this.age�� �͸� ��ü�� age�� ���Ѵ�. >>10 
					//�׳� age�� ClassLambda�� age�� ���Ѵ� >>25
					System.out.println("��� ���� : " + date);
					int result = amount*price;
					return result;
				}
			};
			
			int mae = myfunc.method1(7, 2000);
			System.out.println("���� �Ѿ� : " + mae);
		}
	}

}
