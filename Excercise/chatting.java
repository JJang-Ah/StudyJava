package Excercise;

public class chatting {

	//9장 연습문제
	
	void startChat(String chatId) {
//		String nickName = null; // 
//		nickName = chatId;		// 이렇게 쓰게되면 에러가 난다.
		String nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					
					String inputData = "안녕하세애";
					String message = "[" + nickName + "]" + inputData; 
					//내부 클래스를 안에 메서드에서 정의해서 사용할 때 매개변수를 받는 메소드 변수는 final특성을 갖기 때문에
					// 초기값으로 null이 지정된 상태에서 다음에 매개변수 값을대입하면 final특성이 위배되어서 에러가 발생
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	
	
	
	
	class Chat{
		void start() {
			System.out.println("채팅이 시작됨");
		}
		void sendMessage(String message) {
			System.out.println("전송 : "+ message);
		}
	}
	
}
