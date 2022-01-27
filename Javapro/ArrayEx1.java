package Javapro;

public class ArrayEx1 {

	public static void main(String[] args) {
		
//		// 변수란 하나의 값을 저장 할 수있는 공간이다.
//		int num1=30;
//		int num2=50;
//		int num3=70;
//		int num4=90;
//		int num5=84;
//		int sum;
//		sum=num1+num2+num3+num4+num5; //일일이 다 써줘야한다. 어우 귀찮 ;; 그래서 배열이 있다!!!
//		System.out.println(num1);
//				}
		//배열 - 하나의 이름에 여러개의 값을 기억하는 방법
//		
		int nums[]= {89,78,98,65,5,89}; //= int[] nums={3,4,1,4,2,2];
		String chars[]= {"홍길동","관우","제갈량","조조","부처","수트라"};
		int[] names=new int[5]; // 5개가 들어가는 names 배열 선언 >> names[] = {0,0,0,0,0}
		System.out.println(names);
		System.out.println(nums[3]);
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			System.out.println(sum);
			
		}
		

	}

}
