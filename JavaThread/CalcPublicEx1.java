package JavaThread;

public class CalcPublicEx1 {

	public static void main(String[] args) {
		
		Calcculator calc1 = new Calcculator(); //按眉 积己
		
		User1 user1 = new User1(); //静饭靛 按眉 积己
		User2 user2 = new User2();;
		
		user1.setCalc(calc1);
		user1.start();
		
		
		user2.setCalc(calc1);
		user2.start();
		

	}

}
