package JavaLambda;

import java.util.function.IntSupplier;

public class LambdaEx3 {

	public static void main(String[] args) {
		

		IntSupplier ints = () -> {
			int num = (int)(Math.random()*6)+1;
			return num;
		};
		
		int rnum = ints.getAsInt(); //���� ���� ���� ���Ӱ� �Ѱ��ش�.
		System.out.println("����� ���ڴ� ~ : " + rnum);
		
	}

}
