package JavaAPI;

public class SmartPhoneEx1 {

	public static void main(String[] args) {

		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		System.out.println(myPhone.toString());
		System.out.println(myPhone);
	}
	
	//객체 복제 (clone())
	
	//1. 얕은 복제 (thin clone) - 참조할 주소가 복제
	// 기본타입일때 값 복사
	// 참조타입일때 객체의 주소(번지)가 복제
	//2. 깊은 복제 (deep clone) - 객체 자체 복제
	

}
