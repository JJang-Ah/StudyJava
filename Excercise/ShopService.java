package Excercise;

public class ShopService {
	//6�� �������� 18��
	
	private static ShopService service = new ShopService();
	
	
	private ShopService () {
		
	}
	
	static ShopService getInstance () {
	return service;	
	}
	
	
}
