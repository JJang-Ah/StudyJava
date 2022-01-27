package Javapro;

public class DataType2 {

	public static void main(String[] args) {
		byte num1=60;
		int num2=num1;
		System.out.println(num2);
		// 큰 크기 타입 = 작은 크기 타입 자동으로 타입 변환이 된다.
		int num3=457123;
		byte num4=(byte)num3; //1byte만 억지로 짤라서 가져온다.
		
	// 작은 타입은 큰 타입을 감당하지 못한다.
		System.out.println(num4);
		

		int num5=2000;
		double num6=num5;
		
		System.out.println(num6); // sout 
		
		double num7=4.23;
		int num8=(int)num7; // 강제 타입변환 (캐스팅:casting)
		System.out.println(num8);
		
		char ch=(char)num1;
		System.out.println(ch);
	}

}
