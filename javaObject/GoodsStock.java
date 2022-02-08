package JavaObject;

public class GoodsStock {
	
	String goodsCode;
	int stockNum;
	
	
	
	void addStock (int amount) {
		stockNum+=amount;
	}
	
	int subtractStock (int amount) {
		if(amount > stockNum) {
			System.out.println("현재 재고보다 주문량이 많습니다.");
			return 0;
		}
		stockNum-=amount;
		return amount;
	}

}
