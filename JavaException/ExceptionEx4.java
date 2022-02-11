package JavaException;

public class ExceptionEx4 {

	public static void main(String[] args) {
		
		
		String str1 = "1100";
		String str2 = "0";
		try {
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			System.out.println("나눈 결과 : " + (num1/num2));
		}
//		catch(NumberFormatException e) {
//			System.out.println(e.getMessage());
//			System.out.println("수치 변환 불가");
//		}catch(ArithmeticException e) { //다중 catch
//			System.out.println(e.getMessage());
//			System.out.println("0으로 나누지 마세요");
//		}
		catch(NumberFormatException | ArithmeticException e) { //두개의 catch를 이렇게 묶을 순 있지만 권하지는 않는다.
			System.out.println("수치 변환이 불가하거나 0으로 나누시면 안됩니다.");
		}
		catch(Exception e) { //이거 실무에서는 쓰면 안된다. 
			System.out.println(e.getMessage());
			System.out.println("개발자에게 문의하세여");
		}
	}

}
