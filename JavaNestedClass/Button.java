package JavaNestedClass;
// 클래스안의 인터페이스

public class Button {
	OnClickListener listener; //타입이 인터페이스인 필드
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick(); //인터페이스의 추상메소드 호출
	}
	
	interface OnClickListener{
		void onClick();
	}

}
