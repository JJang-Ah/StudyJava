package JavaException;

public class ExceptionEx4 {

	public static void main(String[] args) {
		
		
		String str1 = "1100";
		String str2 = "0";
		try {
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			System.out.println("���� ��� : " + (num1/num2));
		}
//		catch(NumberFormatException e) {
//			System.out.println(e.getMessage());
//			System.out.println("��ġ ��ȯ �Ұ�");
//		}catch(ArithmeticException e) { //���� catch
//			System.out.println(e.getMessage());
//			System.out.println("0���� ������ ������");
//		}
		catch(NumberFormatException | ArithmeticException e) { //�ΰ��� catch�� �̷��� ���� �� ������ �������� �ʴ´�.
			System.out.println("��ġ ��ȯ�� �Ұ��ϰų� 0���� �����ø� �ȵ˴ϴ�.");
		}
		catch(Exception e) { //�̰� �ǹ������� ���� �ȵȴ�. 
			System.out.println(e.getMessage());
			System.out.println("�����ڿ��� �����ϼ���");
		}
	}

}
