package JavaNestedClass;

public class NestedStaticAEx {

	public static void main(String[] args) {
		//�ܺ� Ŭ������ �������� �ʰ� ����Ŭ������ ��ü�� ������ �� �ֵ�.
		NestedStaticA.NestedStaticB nsb = new NestedStaticA.NestedStaticB();
		nsb.num1 = 20;
		nsb.method1();
		nsb.method2();
		NestedStaticA.NestedStaticB.method2(); //���� �޼��� ���� ���
	}

}
