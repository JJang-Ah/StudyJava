package JavaCollection;

public class Student {

	public int sno; //�й� �ʵ�
	public String name; //�̸� �ʵ�
	
	public Student(int sno, String name) {
		this.sno = sno ;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) { //student Ŭ������ ��ü�� �ްٴ�
			Student student = (Student) obj;
			return (sno == student.sno && (name.equals(student.name))); //�̷��� ���� �����Ѵ�.
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
}
