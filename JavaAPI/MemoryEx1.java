package JavaAPI;

public class MemoryEx1 {

	public static void main(String[] args) {
		Book book = null;
		
		for(int i=1; i<=50; i++) {
			book = new Book(i);
			book = null; //������ �ڷᰡ ������ �ּҸ� ���شٴ� ���
			System.gc(); 
			//�������÷��� : ������ ������ >> null������ ��������ʴ� ��ü�� ����
		}
		
	}
	
	

}
