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
						System.out.println("��Ű~ : " + num);
					}else {
						System.out.println("��Ű�� : " + num);
					}
				}
			}
		};
		
		Thread thread = new Thread(runa);
		thread.start();
		// =============================================
		//���ٽ� ǥ�� >> �޼ҵ尡 �ϳ��־�� �� �� �ִ�. �Լ��� ǥ���̱� ����
		//runa2�� ���ٽ�
		Runnable runa2 = () -> {
			for(int i=0; i<10; i++) {
				System.out.print(((int)(Math.random()*6)+1) + "^^ ");
			}
		};
		Thread thread2 = new Thread(runa2);
		thread2.start();
		//====================================================
		//thread3�� ���ٽ�
		Thread thread3 = new Thread(() -> {
			for(int i=0; i<10; i++) {
				System.out.print(((int)(Math.random()*6)+1) + " ");
			}
		}
		);
		thread3.start();
		
	}

}
