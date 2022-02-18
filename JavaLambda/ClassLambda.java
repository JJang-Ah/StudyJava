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
					System.out.println("고객의 나이 : " +age); 
					// this.age는 익명 개체의 age를 뜻한다. >>10 
					//그냥 age는 ClassLambda의 age를 뜻한다 >>25
					System.out.println("출고 일자 : " + date);
					int result = amount*price;
					return result;
				}
			};
			
			int mae = myfunc.method1(7, 2000);
			System.out.println("매출 총액 : " + mae);
		}
	}

}
