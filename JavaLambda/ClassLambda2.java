package JavaLambda;

public class ClassLambda2 {

	public int age = 25;
	
	class InnerClass {
		int date = 30;
		
		void inmethod1() { //���ٽ� ǥ������ ���
			MyFunctionIneterface myfunc = (amount,price)->{
				System.out.println("���� ���� : " +ClassLambda2.this.age);
				//ClassLambda2 Ŭ���� ���� age 
				System.out.println("��� ���ھ� : " + date);
				int result = amount*price;
				return result;
			};
			
			int mae = myfunc.method1(7, 2000);
			System.out.println("���� �Ѿ� : " + mae);
		}
	}
}
