package Excercise;

public class ShopService {
	//6장 연습문제 18번
	
	private static ShopService service = new ShopService();
	
	
	private ShopService () {
		
	}
	
	static ShopService getInstance () {
	return service;	
	}
	
	
}
