package JavaGeneric;

public class ChildProductEx1 {

	public static void main(String[] args) {

		ChildProduct<TV, String, String> product1 =
				 new ChildProduct<>();
		
		product1.setKind(new TV());
		product1.setModel("����Ʈ ������");
		product1.setCompany("�Ｚ");
		
		
	}

}
