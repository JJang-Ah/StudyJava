package JavaNestedClass;
// Ŭ�������� �������̽�

public class Button {
	OnClickListener listener; //Ÿ���� �������̽��� �ʵ�
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick(); //�������̽��� �߻�޼ҵ� ȣ��
	}
	
	interface OnClickListener{
		void onClick();
	}

}
