package JavaObject;

public class RectangleEx1 {

	public static void main(String[] args) {

		int area;
		try {
			Rectangle rect1=new Rectangle(10, 20);
	//		System.out.println("�簢���� �ʺ� : " + rect1.width); //�ʵ忡 ������ �������վ ������ ����.
			
			rect1.setHeight(59);
			
			area=rect1.getArea();
			System.out.println("�簢���� �Ф��� : " + area);
			System.out.println("�簢���� �ʺ� : " + rect1.getWidth());
			System.out.println("�簢���� ���� : " + rect1.getHeight());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}



//ĸ��ȭ >> private
//���� ������ ������ ã�ƺ���
//�ذ� ��� ���� �����غ���