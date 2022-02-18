package JavaLambda;

public class LambdaEx2 {

	public static void main(String[] args) {

		Runnable runa = new Runnable() {
			@Override
			public void run() {
				int luck=3;
				int num;
				for(int i=0; i<10; i++) {
					num=(int)(Math.random()*6)+1;
					if(num==luck) {
						System.out.println("렄키~ : " + num);
					}else {
						System.out.println("언럭키ㅠ : " + num);
					}
				}
			}
		};
		
		Thread thread = new Thread(runa);
		thread.start();
		// =============================================
		//람다식 표현 >> 메소드가 하나있어야 할 수 있다. 함수식 표현이기 때문
		//runa2를 람다식
		Runnable runa2 = () -> {
			for(int i=0; i<10; i++) {
				System.out.print(((int)(Math.random()*6)+1) + "^^ ");
			}
		};
		Thread thread2 = new Thread(runa2);
		thread2.start();
		//====================================================
		//thread3를 람다식
		Thread thread3 = new Thread(() -> {
			for(int i=0; i<10; i++) {
				System.out.print(((int)(Math.random()*6)+1) + " ");
			}
		}
		);
		thread3.start();
		
	}

}
