package Excercise;

public class AnonmousEx {

	public static void main(String[] args) {

		//9¿Â ø¨Ω¿πÆ¡¶
		
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle(){
			public void run() {
				System.out.println("ΩπΩπΩπ ∆Æ∑∞¿Ã ¥ﬁ∏≥¥œ¥Ÿ.");
			}
		});
	}

}
