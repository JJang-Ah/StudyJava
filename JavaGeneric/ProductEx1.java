package JavaGeneric;

public class ProductEx1 {

	public static void main(String[] args) {
		//���׸� ��Ƽ Ÿ�� �Ķ���� ����
		// TV, String �ΰ��� ���� �� �ִ�.
		Product<TV, String> product1 = new Product<TV, String>();
		product1.setKind(new TV());
		product1.setModel("����Ʈ TV");
		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//Audio, String �ΰ��� ���� �� �ִ�.
		Product<Audio, String> product2 = new Product<Audio, String>();
		product2.setKind(new Audio());
		product2.setModel("���ֿ�� �����");
		
		
		
		
	}

}
