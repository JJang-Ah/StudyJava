package Excercise;

public class chatting {

	//9�� ��������
	
	void startChat(String chatId) {
//		String nickName = null; // 
//		nickName = chatId;		// �̷��� ���ԵǸ� ������ ����.
		String nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					
					String inputData = "�ȳ��ϼ���";
					String message = "[" + nickName + "]" + inputData; 
					//���� Ŭ������ �ȿ� �޼��忡�� �����ؼ� ����� �� �Ű������� �޴� �޼ҵ� ������ finalƯ���� ���� ������
					// �ʱⰪ���� null�� ������ ���¿��� ������ �Ű����� ���������ϸ� finalƯ���� ����Ǿ ������ �߻�
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	
	
	
	
	class Chat{
		void start() {
			System.out.println("ä���� ���۵�");
		}
		void sendMessage(String message) {
			System.out.println("���� : "+ message);
		}
	}
	
}
