package JavaLambda;

public class ClassLambda2Ex1 {

	public static void main(String[] args) {
		ClassLambda2 cLambda2 = new ClassLambda2();
		ClassLambda2.InnerClass inner = cLambda2.new InnerClass();
		inner.inmethod1();
		//익명 객체 내부에서는 this는 익명 객체 필드를 참조한다.
		
		
		
	}

}
