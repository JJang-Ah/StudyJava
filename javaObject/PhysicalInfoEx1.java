package javaObject;

public class PhysicalInfoEx1 {

	public static void main(String[] args) {

		PhysicalInfo younghee = new PhysicalInfo("�����ǰ���",25,170,55);
		printPysicalInfo(younghee);
		younghee.update(26, 172, 56);
		printPysicalInfo(younghee);
		younghee.update(28, 171);
		printPysicalInfo(younghee);
		younghee.update(29);
		
		
		
	}
	//������ �޼���
	static void printPysicalInfo (PhysicalInfo obj) {
		System.out.println("�̸� : " + obj.name);
		System.out.println("���� : " + obj.age);
		System.out.println("Ű : "+ obj.height);
		System.out.println("������ : " + obj.weight);	
		System.out.println("=========================");
	}
	
	

}
