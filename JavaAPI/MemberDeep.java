package JavaAPI;

import java.util.Arrays;

public class MemberDeep implements Cloneable{

	//깊은 복제
	
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public MemberDeep(String name, int age, 
			int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	public MemberDeep getMember() { 
		MemberDeep cloned = null;
		try {//clone은 예외를 의무적으로 요구한다
			cloned = (MemberDeep)clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return cloned;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		//일반 필드는 얕은 복제로 처리
		MemberDeep cloned = (MemberDeep)super.clone();
		//필드의 scores를 scores길이만큼 복사한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); 
		//car는 클래스 (객체)이므로 깊은 복제로 처리
		cloned.car = new Car(this.car.model);
		return cloned;
		
	}
	
	
}


















