package Javapro;

public class ArrayEx15 {

	public static void main(String[] args) {
		//라이브러리를 이용한 배열 복사
		int[] oldArray= {10,20,30};
		int[] newArray= new int[5];
//		for(int i=0; i<oldArray.length; i++) {
//			newArray[i]=oldArray[i];
//		}
		
//System.arraycopy(복사할 배열, 복하살 배열의 시작위치, 복사를 받을 배열, 새로운 배열의 시작위치, 복사할 배열의 크리);
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		

		for(int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
			
		}
		
	}

}
