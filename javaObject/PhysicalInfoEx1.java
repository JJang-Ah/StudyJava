package javaObject;

public class PhysicalInfoEx1 {

	public static void main(String[] args) {

		PhysicalInfo younghee = new PhysicalInfo("영희영의고영희",25,170,55);
		printPysicalInfo(younghee);
		younghee.update(26, 172, 56);
		printPysicalInfo(younghee);
		younghee.update(28, 171);
		printPysicalInfo(younghee);
		younghee.update(29);
		
		
		
	}
	//성장기록 메서드
	static void printPysicalInfo (PhysicalInfo obj) {
		System.out.println("이름 : " + obj.name);
		System.out.println("나이 : " + obj.age);
		System.out.println("키 : "+ obj.height);
		System.out.println("몸무게 : " + obj.weight);	
		System.out.println("=========================");
	}
	
	

}
