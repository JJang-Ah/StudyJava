package JavaAPI;

public class Book {

	private int no;
	public Book(int no) {
		this.no=no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		//��ü �Ҹ���
		//��ü�� �Ҹ��ϱ� ������ ����Ǵ� �޼���
		System.out.println(no + "�� ��ü�� finalize()�� ����Ǿ����ϴ�.");
	}
	
	
}
