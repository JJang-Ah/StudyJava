package JavaLambda;

public class ClassLambdaEx1 {

	public static void main(String[] args) {

		ClassLambda cLambda = new ClassLambda(); //��ü����
		//��ø Ŭ���� ����
		ClassLambda.InnerClass inner = cLambda.new InnerClass();
		inner.inmethod1();
		
		
		
	}

}
