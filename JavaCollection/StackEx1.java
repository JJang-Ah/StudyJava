package JavaCollection;

import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {

		
		Stack<Coin> coinBox= new Stack<Coin>();
		coinBox.push(new Coin(500)); //push는 집어 넣는것
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop(); //pop은 꺼내는 것 
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
		//stack은 넣은 순서의 마지막부터 나오게된다.
		

		
		
		
	}

}
