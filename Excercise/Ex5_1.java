package Excercise;

public class Ex5_1 {

	public static void main(String[] args) {

		int max=0;
		int[] array= {1,5,3,8,2,45,99,85,624,51,25,453,65};
		
		for(int i=0; i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
				
			}
		}
		System.out.println("최대 값은 : " + max);
		
	}

}
