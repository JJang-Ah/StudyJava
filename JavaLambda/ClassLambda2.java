package JavaLambda;

public class ClassLambda2 {

	public int age = 25;
	
	class InnerClass {
		int date = 30;
		
		void inmethod1() { //람다식 표현으로 사용
			MyFunctionIneterface myfunc = (amount,price)->{
				System.out.println("고객의 나이 : " +ClassLambda2.this.age);
				//ClassLambda2 클래스 안의 age 
				System.out.println("출고 일자아 : " + date);
				int result = amount*price;
				return result;
			};
			
			int mae = myfunc.method1(7, 2000);
			System.out.println("매출 총액 : " + mae);
		}
	}
}
