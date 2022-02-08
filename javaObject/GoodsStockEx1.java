package JavaObject;

public class GoodsStockEx1 {

	public static void main(String[] args) {
		int amount;
		GoodsStock ballpen;
		ballpen = new GoodsStock();
		ballpen.goodsCode = "afs12312344";
		ballpen.stockNum =19;		
		ballpen.addStock(50);
		System.out.println("재고 수량 : "+ballpen.stockNum);
		ballpen.subtractStock(990);
		System.out.println("재고 수량 : "+ballpen.stockNum);
		amount = ballpen.subtractStock(30);
		System.out.println("제품 번호 : "+ ballpen.goodsCode);
		System.out.println("납품 수량 : "+ amount);
		System.out.println("재고 수량 : "+ ballpen.stockNum);
		
		
		
		

		
		
	}

}
