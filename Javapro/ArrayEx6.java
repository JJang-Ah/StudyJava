package Javapro;

public class ArrayEx6 {

	public static void main(String[] args) {
		
//		String name=args[0];
		//run configuration 들어가서 arguments들어가서 값을 45 60 입력
		String num1=args[0]; // =45
		String num2=args[1]; // =60
		
		//Integer.parseInt(s) >> 문자형인 숫자s를 int값으로 바꿔준다.
		System.out.println((num1+num2)+"님 안녕하셈"+ (Integer.parseInt(num1)+Integer.parseInt(num2)));
		
		
		
	}

}
