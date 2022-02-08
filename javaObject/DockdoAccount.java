package JavaObject;

public class DockdoAccount {

	public static void main(String[] args) {

		DokdoAccount younghee = new DokdoAccount("111-111-111111", "¿µÀÇ¿µÈñ°í¿µÈñ", 200000);
		younghee.deposit(30000);
		System.out.println("ÀÜ¾× : " + younghee.balance);
		System.out.println("µ¶µµ Æ÷ÀÎÆ® : " + younghee.point);
		
		
		
	}
}
