package Javapro;

public class IfCommand6 {

	public static void main(String[] args) {
		int num1=3672;
		if(num1<Byte.MIN_VALUE/* -128 써도된다 */ || num1>Byte.MAX_VALUE/* 127 써도된다*/) {
			System.out.println("byte값으로 변환할 수 없는 값입니다.");
			System.out.println("값을 다시 확인해 주세요");
			
		}else {
		byte bnum1=(byte)num1;
		System.out.println(bnum1);
		
		
		
		}
	}

}
