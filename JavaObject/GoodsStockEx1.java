package JavaObject;

public class GoodsStockEx1 {

	public static void main(String[] args) {
		int amount;
		GoodsStock ballpen;
		ballpen = new GoodsStock();
		ballpen.goodsCode = "afs12312344";
		ballpen.stockNum =19;		
		ballpen.addStock(50);
		System.out.println("��� ���� : "+ballpen.stockNum);
		ballpen.subtractStock(990);
		System.out.println("��� ���� : "+ballpen.stockNum);
		amount = ballpen.subtractStock(30);
		System.out.println("��ǰ ��ȣ : "+ ballpen.goodsCode);
		System.out.println("��ǰ ���� : "+ amount);
		System.out.println("��� ���� : "+ ballpen.stockNum);
		
		
		
		

		
		
	}

}
