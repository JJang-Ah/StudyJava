package JavaAPI;

public class MemberDeepEx1 {

	public static void main(String[] args) {

		MemberDeep original = new MemberDeep("철수", 39, new int[]
				 {59, 70, 80}, new Car("소나타"));
		MemberDeep cloned = original.getMember();
		cloned.scores[1] = 90;
		cloned.car.model = "그랜저";
		
		System.out.println("원본 객체");
		System.out.println("이름 : " + original.name);
		System.out.println("나이 : " + original.age);
		System.out.println("***점수***");
		for(int i=0; i<original.scores.length; i++) {
			System.out.println((i+1) + "번째 과목 점수 : " 
		+ original.scores[i]);
		}
		System.out.println("차 모델 : " + original.car.model);
		
		System.out.println("================================");
		System.out.println("복제 객체");
		System.out.println("이름 : " + cloned.name);
		System.out.println("나이 : " + cloned.age);
		System.out.println("***점수***");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.println((i+1) + "번째 과목 점수 : " 
		+ cloned.scores[i]);
		}
		System.out.println("차 모델 : " + cloned.car.model);
	}

}
