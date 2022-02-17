package JavaGeneric;

public class ProductEx1 {

	public static void main(String[] args) {
		//제네릭 멀티 타입 파라미터 예제
		// TV, String 두가질 받을 수 있다.
		Product<TV, String> product1 = new Product<TV, String>();
		product1.setKind(new TV());
		product1.setModel("스마트 TV");
		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//Audio, String 두가질 받을 수 있다.
		Product<Audio, String> product2 = new Product<Audio, String>();
		product2.setKind(new Audio());
		product2.setModel("서롸운드 오디오");
		
		
		
		
	}

}
