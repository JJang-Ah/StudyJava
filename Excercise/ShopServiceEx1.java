package Excercise;

public class ShopServiceEx1 {

	public static void main(String[] args) {

		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		
		if ( obj1 == obj2) {
			System.out.println("???? ??ü?̴?~");
		}else {
			System.out.println("?ٸ? ??ü?̴?.!~");
		}
	}

}
