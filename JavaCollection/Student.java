package JavaCollection;

public class Student {

	public int sno; //학번 필드
	public String name; //이름 필드
	
	public Student(int sno, String name) {
		this.sno = sno ;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) { //student 클래스의 객체만 받겟다
			Student student = (Student) obj;
			return (sno == student.sno && (name.equals(student.name))); //이러면 참을 리턴한다.
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
}
