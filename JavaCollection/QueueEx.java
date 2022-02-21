package JavaCollection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {

		//Queue�� ���� ������� ���´�.
		
		Queue<Message> msgQueue = new LinkedList<Message>();
		msgQueue.offer(new Message("sendMail", "ȫ�浿"));
		msgQueue.offer(new Message("sendSMS", "��ö��"));
		msgQueue.offer(new Message("sendKakaoTalk", "��¯��"));
		while(!msgQueue.isEmpty()) {
			Message msg = msgQueue.poll();
			switch(msg.command) {
			case "sendMail":
				System.out.println(msg.to + "�Կ��� �̸����� �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(msg.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKakaoTalk":
				System.out.println(msg.to + "�Կ��� ī���� �����ϴ�.");
				break;
			}
		}
		
		
		
		
	}

}
