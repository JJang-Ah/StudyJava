package JavaException;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		try {
			String hello = null; //��ü�� �����ϰ� ���� �ʴ�.
			System.out.println(hello.toString());
			
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("����� ���ڰ� �����ϴ�.");
		}

	
	//���� ó�� >> ������ �߻��ϸ� ���α׷��� �������� �ʰ� �ڵ鸵���� ó���Ͽ� ���� ���� ���°� �����ǵ��� �ϴ� ���
		
	}
}