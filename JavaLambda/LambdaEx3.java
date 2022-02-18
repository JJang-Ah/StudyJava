package JavaLambda;

import java.util.function.IntSupplier;

public class LambdaEx3 {

	public static void main(String[] args) {
		

		IntSupplier ints = () -> {
			int num = (int)(Math.random()*6)+1;
			return num;
		};
		
		int rnum = ints.getAsInt(); //리턴 받은 값을 새롭게 넘겨준다.
		System.out.println("행운의 숫자는 ~ : " + rnum);
		
	}

}
