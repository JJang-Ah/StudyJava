package Excercise;

public class Student {

	
	//11�� ���� ����
	private String studentNum;
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	
	
	
	
	
}
