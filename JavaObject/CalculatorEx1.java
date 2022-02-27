package JavaObject;

public class CalculatorEx1 {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		int[] values1 = {23,14,512,213};
		int result1=myCalc.add(values1);
		System.out.println("더한 계산 결과 : " +result1);
		
		int result2=myCalc.add(new int[] {15,7,43,5,3,52,2});
		// int[] 이름이 없다 << 익명 개체
		System.out.println("더한 계산 결과 : "+ result2);
		
		int result3= myCalc.add(13,24,31,24,31,23);
		System.out.println("더한 계싼 결과 : "+ result3);
		double result4 = myCalc.Divide(431, 13);
		System.out.println("계산 결과 : " + result4);
		
		//메소드 호출
		//내부 호출 >> 메소드이름(매개변수)
		//외부 호출 >> new 객체를 생성 후 객체이름.메서드이름(매개값)
		
		
		
		
		
		
	}

}
