package JavaNestedClass;

public class ButtonEx1 {

	public static void main(String[] args) {
		Button button1 = new Button();
		button1.setOnClickListener(new CallListener());
		button1.touch();
		button1.setOnClickListener(new MessageListener());
		button1.touch();
		
		
		Button button2 = new Button();
		
	}

}
