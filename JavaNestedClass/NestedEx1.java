package JavaNestedClass;

public class NestedEx1 {

	public static void main(String[] args) {

		NestedA na = new NestedA(); //�ܺ� Ŭ���� �ν��Ͻ� ��ü ����
		NestedA.NestedB nb = na.new NestedB(); // ���� Ŭ���� �ν��Ͻ� ��ü����
		nb.num=50; //���� Ŭ���� �ʵ� ����
		nb.method1(); // ���� Ŭ���� �޼��� ����
		
		
	}

}
