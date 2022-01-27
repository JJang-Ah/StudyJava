package Javapro;

public class WhileEx {

	public static void main(String[] args) {

		int sum=0;
		int i=1;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("1부터 100까지의 합 = "+sum);
		
		
	}

}

//do while  	//거의 안쓰인다. ㅎㅎ

//do {
//실행문;
//...
//}while(조건);		  >> ; 세미콜론 꼭 해야한다. 중요

