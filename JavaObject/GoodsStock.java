package JavaObject;

public class GoodsStock {
	
	String goodsCode;
	int stockNum;
	
	
	
	void addStock (int amount) {
		stockNum+=amount;
	}
	
	int subtractStock (int amount) {
		if(amount > stockNum) {
			System.out.println("���� ����� �ֹ����� �����ϴ�.");
			return 0;
		}
		stockNum-=amount;
		return amount;
	}

}
