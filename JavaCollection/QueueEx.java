package JavaCollection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {

		//Queue´Â ³ÖÀº ¼ø¼­´ë·Î ³ª¿Â´Ù.
		
		Queue<Message> msgQueue = new LinkedList<Message>();
		msgQueue.offer(new Message("sendMail", "È«±æµ¿"));
		msgQueue.offer(new Message("sendSMS", "±èÃ¶¼ö"));
		msgQueue.offer(new Message("sendKakaoTalk", "½ÅÂ¯±¸"));
		while(!msgQueue.isEmpty()) {
			Message msg = msgQueue.poll();
			switch(msg.command) {
			case "sendMail":
				System.out.println(msg.to + "´Ô¿¡°Ô ÀÌ¸ÞÀÏÀ» º¸³À´Ï´Ù.");
				break;
			case "sendSMS":
				System.out.println(msg.to + "´Ô¿¡°Ô SMS¸¦ º¸³À´Ï´Ù.");
				break;
			case "sendKakaoTalk":
				System.out.println(msg.to + "´Ô¿¡°Ô Ä«ÅåÀ» º¸³À´Ï´Ù.");
				break;
			}
		}
		
		
		
		
	}

}
