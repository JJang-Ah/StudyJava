package JavaObject;

public class Shooting {
//������̼� ����
	@PrintAnnotation
	public void shoot1() {
		System.out.println("�⺻ �߻�~");
	}
	
	@PrintAnnotation("��")
	public void shoot2() {
		System.out.println("�� �߻�~");
	}
	@PrintAnnotation(value = "��", number = 30)
	public void shoot3() {
		System.out.println("���� ����� �߻�");
		
		
	}
	
}
