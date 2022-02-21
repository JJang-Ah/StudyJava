package JavaCollection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapEx3 {

	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<String, String>();
		//hashtable >> 동기화 되었기 떄문에 어떤 메소드가 완벽하게 수행이 되기전까지는 진행되지않는다.
		
		map.put("hong", "12345"); //키(아이디) 와 값(비밀번호)
		map.put("kimcs", "22222");
		map.put("young", "11111");
		map.put("chanho", "33333");
		map.put("sundal", "44444");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디를 입력 : ");
			String id = sc.next();
			System.out.print("비밀번호를 입력 : ");
			String pass = sc.next();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pass)) {
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("입력하신 아이디가 존재하지 않습니다.");
				}
					
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}

		
		
		
		
	}

}
