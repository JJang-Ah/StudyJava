package JavaLambda;

public class FuntionInterfaceEx1 {

	public static void main(String[] args) {
		
//		MyFunctionIneterface myfunc2 =new MyFunctionIneterface() {
//			@Override
//			public void method1() {
//				System.out.println("�޼��� ����");
//			}
//		};
//		//================================================
//		//���ٽ� ���
//		MyFunctionIneterface myfunc = () -> {
//			System.out.println("�޼ҵ� �������� �����޴�~");
//		};
//		//=================================================
//		//�� �ڵ�� ����.
//		
//		MyFunctionIneterface myfunc3;
//		myfunc3 = () -> {
//			String name = "ȫ�浿" ;
//			System.out.println(name + " ���� �ҵ� ����");
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
