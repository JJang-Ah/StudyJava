package Javapro;

public class DoWhileEx1 {

	public static void main(String[] args) {
		//do while  	//거의 안쓰인다. ㅎㅎ

		//do {
		//실행문;
		//...
		//}while(조건);		  >> ; 세미콜론 꼭 해야한다. 중요 , 다름 for나 while은 ; 절대 쓰지않는다.


		int i=1;
		do {
			System.out.println("현재 i의 값 = " + i);
			i++;
			
		}while(i<=10); //조건과 관계없이 조건에 부합하지않아도 1번은 수행한다.
		
			
	}

}

//1부터 100사이의 숫자를 맞추는 게임
