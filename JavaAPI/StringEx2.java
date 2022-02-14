package JavaAPI;

public class StringEx2 {

	public static void main(String[] args) {

		String str = "computer";
		char cValue = str.charAt(3);//3자리에 있는 글자하나를 가져온다.
		System.out.println(cValue);
		//예제 ss10023 사원코드
		// ss 삼성
		// 세번째 1자리는 부서명 (1.경리부 2.영업부 3.자재부)
		// 네번째부터 끝까지는 그냥 사원번호
		String cnum = "SS10023"; 
		switch (cnum.charAt(2)) {
		case '1':
			System.out.println("경리부");
			break;
		case '2':
			System.out.println("영업부");
			break;
		case '3':
			System.out.println("자재부");
			break;
		}
		
		
		String ssn = "920512-2354711";
		//문제 ssn는 주민등록번호이다. 성별을 판단하시오.
		
		switch (ssn.charAt(7)) {
		case '1':
			System.out.println("남자입니당");
			break;
		case '2':
			System.out.println("여자입니당");
			break;
		}
		
		
		if(ssn.charAt(7) == 1 || ssn.charAt(7) ==3) {
			System.out.println("남자데스");
		}else if(ssn.charAt(7) == 2 || ssn.charAt(7) ==4) {
			System.out.println("여자데스");
		}
		
		
	}

}
