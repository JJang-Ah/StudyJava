package JavaAPI;

import java.util.Arrays;

public class MemberDeep implements Cloneable{

	//���� ����
	
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
		try {//clone�� ���ܸ� �ǹ������� �䱸�Ѵ�
			cloned = (MemberDeep)clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return cloned;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		//�Ϲ� �ʵ�� ���� ������ ó��
		MemberDeep cloned = (MemberDeep)super.clone();
		//�ʵ��� scores�� scores���̸�ŭ �����Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); 
		//car�� Ŭ���� (��ü)�̹Ƿ� ���� ������ ó��
		cloned.car = new Car(this.car.model);
		return cloned;
		
	}
	
	
}


















