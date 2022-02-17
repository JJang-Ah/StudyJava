package JavaGeneric;

public class ChildProductEx1 {

	public static void main(String[] args) {

		ChildProduct<TV, String, String> product1 =
				 new ChildProduct<>();
		
		product1.setKind(new TV());
		product1.setModel("스마트 에어컨");
		product1.setCompany("삼성");
		
		
	}

}
