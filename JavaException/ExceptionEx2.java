package JavaException;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			int[] nums = {10,20,50,60,40};
			System.out.println(nums[9]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("�迭 �ε������� ������ϴ�.");
		}
	}

}
