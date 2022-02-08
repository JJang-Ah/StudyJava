package JavaObject;

public class Calculator {
	//메소드만 만들것이다.
	
	//전원 on 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
//	// 더하기 메서드
//	int add(int x, int y) {
//		int result = x + y;
//		return result;
//	}
//	
	// 갱신된 더하기 메소드
//	int add(int[] values) {
//		int sum=0;
//		for(int i=0;i<values.length; i++) {
//			sum+=values[i];
//		}
//		return sum;
//	}
	
	//더하기 메소드 개선2
	//매개 변수의 수를 모를 경우
	int add (int ...values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	// 빼기 메서드
	int subtract (int x, int y) {
		int result = x - y;
		return result;
	}
	// 곱하기 메서드
	int Multiply (int x, int y) {
		int result = x+y;
		return result;
	}
	// 나누기 메서드
	double Divide (int x, int y) {
		double result = (double)x/y;
		return result;
	}
	// 전원 off 메서드
	
	
	

}
