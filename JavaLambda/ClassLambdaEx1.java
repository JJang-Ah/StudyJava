package JavaLambda;

public class ClassLambdaEx1 {

	public static void main(String[] args) {

		ClassLambda cLambda = new ClassLambda(); //객체생성
		//중첩 클래스 사용법
		ClassLambda.InnerClass inner = cLambda.new InnerClass();
		inner.inmethod1();
		
		
		
	}

}
