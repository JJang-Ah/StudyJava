package Excercise;

public class IntegerCompareEx11 {

	public static void main(String[] args) {

		Integer obj1 = 100; //integer는 주소를 가진 객체이다
		Integer obj2 = 100; //int는 주소가 없다.
		Integer obj3 = 300;
		Integer obj4 = 300;
		System.out.println(obj1 == obj2); 
		System.out.println(obj3 == obj4);
		
		//obj1 == obj2 는 true
		//obj3 == obj4 는 false 가 나오는 이유?
		//원래는 주소값이 다르기때문에 false가 나와야하지만
		//정수100이하의 값을 가지면 예외적으로 가능하다.
		
		
		
	}

}
