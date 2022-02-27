package JavaObject;

public class abstractEx1 {

	public static void main(String[] args) {

		Tiger bibi =new Tiger();
		Eagle mimi = new Eagle();
		
		bibi.name="비비";
		mimi.name="미미";
		bibi.age=2;
		System.out.println(bibi.name + "는 "+ bibi.age + "살입니다.");
		bibi.move();
		
		
		mimi.home="미쿡";
		System.out.println(mimi.name+"는 "+mimi.home+"에 삽니다.");
		mimi.move();
				
	}

}
