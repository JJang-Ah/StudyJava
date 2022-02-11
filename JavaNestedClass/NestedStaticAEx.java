package JavaNestedClass;

public class NestedStaticAEx {

	public static void main(String[] args) {
		//외부 클래스를 생성하지 않고 내부클래스의 객체를 생성할 수 있따.
		NestedStaticA.NestedStaticB nsb = new NestedStaticA.NestedStaticB();
		nsb.num1 = 20;
		nsb.method1();
		nsb.method2();
		NestedStaticA.NestedStaticB.method2(); //정적 메서드 접근 방법
	}

}
