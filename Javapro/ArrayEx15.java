package Javapro;

public class ArrayEx15 {

	public static void main(String[] args) {
		//���̺귯���� �̿��� �迭 ����
		int[] oldArray= {10,20,30};
		int[] newArray= new int[5];
//		for(int i=0; i<oldArray.length; i++) {
//			newArray[i]=oldArray[i];
//		}
		
//System.arraycopy(������ �迭, ���ϻ� �迭�� ������ġ, ���縦 ���� �迭, ���ο� �迭�� ������ġ, ������ �迭�� ũ��);
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		

		for(int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
			
		}
		
	}

}
