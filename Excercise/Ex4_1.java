package Excercise;

public class Ex4_1 {

	public static void main(String[] args) {
		//3의 배수의 합
		int sum=0;
		for (int i=0; i<=100; i+=1) {
			if(i%3==0) {
			sum += i ;
			}	
		}
		System.out.println(sum);
		
	}

}
