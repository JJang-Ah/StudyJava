package JavaCollection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx2 {

	public static void main(String[] args) {

		TreeSet<Integer> set1 = new TreeSet<Integer>();
		set1.add(new Integer(50));
		set1.add(new Integer(40));
		set1.add(new Integer(10));
		set1.add(new Integer(30));
		set1.add(new Integer(80));
		set1.add(69);
		set1.add(99);
		set1.add(59);
		set1.add(70);
		set1.add(66);
		set1.add(86);
		//set1.remove(14); >> 14 �ڷḦ �����Ѵ�.
		//set1.clear(); >> �ڷḦ ���� �����Ѵ�.
		
		System.out.println("�ڷ��� ���� : " + set1.size());
		System.out.println("���� ���� : " + (set1).first()); //�ּڰ� ���ϴ� �޼ҵ� 
		// .first >treeset�� �޼ҵ�� ĳ�������ְų� ������ Treeset���� ���־���Ѵ�.
		System.out.println("�ְ� ���� : " + (set1).last()); // �ִ� ���ϴ� �޼ҵ�
		
		System.out.println("80�� �Ʒ� ���� : " + set1.lower(new Integer(80)));
		System.out.println("90�� �� ���� : " + set1.higher(90));
		Iterator<Integer> iterator = set1.iterator();
		
		while(iterator.hasNext()) {
			Integer score = iterator.next();
			System.out.print(" " +score);
			//������ �ٲ��.
			
		}
	}

}
