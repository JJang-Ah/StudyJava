package JavaLambda;

public class FuntionInterfaceEx1 {

	public static void main(String[] args) {
		
//		MyFunctionIneterface myfunc2 =new MyFunctionIneterface() {
//			@Override
//			public void method1() {
//				System.out.println("메서드 구현");
//			}
//		};
//		//================================================
//		//람다식 사용
//		MyFunctionIneterface myfunc = () -> {
//			System.out.println("메소드 구현했음 구현햇다~");
//		};
//		//=================================================
//		//위 코드와 같다.
//		
//		MyFunctionIneterface myfunc3;
//		myfunc3 = () -> {
//			String name = "홍길동" ;
//			System.out.println(name + " 음메 소드 구현");
//		};
//		
//		myfunc3.method1();
		
		
		MyFunctionIneterface myfunc;
		myfunc = (amount,price) -> {
			return amount*price;
		};

		System.out.println(myfunc.method1(13, 2000));
		
		myfunc = (amount,price) -> amount*price;
		System.out.println(myfunc.method1(39, 2999));
	}

}
