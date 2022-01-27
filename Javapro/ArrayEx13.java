package Javapro;

public class ArrayEx13 {

	public static void main(String[] args) {
		//string : 참조 개체 배열

		String[] strArray=new String[3]; 	//객체 배열 생성
		strArray[0]="홍길동";
		strArray[1]="홍길동";
		strArray[2]=new String("홍길동"); //객체 생성
		int[] nums=new int[3];
		nums[0]=10;
		nums[1]=30;
		nums[2]=50;
		
		if(nums[0]==nums[1]) {
			System.out.println("같은 값입니다.");
			
		}else {
			System.out.println("다른 값입니다.");
		}
		
		if(strArray[0]==strArray[2]) {
			System.out.println("같은 번지입니다.");
			
		}else {
			System.out.println("다른 번지입니다.");
		}
		if(strArray[0].equals(strArray[2])) {
			System.out.println("같은 문자입니다.");
		}else {
			System.out.println("다른 문자입니다.");
		}
		
		
		
		
		
		
		
		
	}

}
