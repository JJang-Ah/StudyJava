package JavaAPI;

public class MathEx1 {

	public static void main(String[] args) {

		System.out.println(Math.abs(-12)); //Math.abs() >> 절대값 구하기
		System.out.println(Math.ceil(5.4)); // 올림
		System.out.println(Math.floor(3.4)); // 내림
		System.out.println(Math.round(5.5)); //반올림
		int max = Math.max(13,23); //둘중에 큰값
		System.out.println(max);
		double dmax = Math.max(45.6, 85.1);
		System.out.println(dmax);
		int min = Math.min(10, 30);
		System.out.println(min); //작은값 리턴
		
	}

}
