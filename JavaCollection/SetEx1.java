package JavaCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {

		//Set(�������̽�) -  �ߺ� �Ұ���
		//���� Ŭ����
		//HashSet
		//TreeSet
		
		//Map(�������̽�)
		//HashMap
		//TreeMap
		
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("ȫ���");
		set1.add("��¯��");
		set1.add("���̼�");
		set1.add("���̸�");
		set1.add("����");
		set1.add("������");
		set1.add("��¯��");
		
		set1.remove("����"); //set�� �̷��� ���� ���� ����־� ������ �ؾ��Ѵ�.
		// �ε������� ������ ����.
		
		System.out.println("�ڷ��� ���� : " + set1.size());
		// �ߺ��� �ڷ�� ���� ��� �ϳ��� ģ��.
		
		
		Iterator<String> iterator = set1.iterator(); 
		// Iterator : set ������ �ڷḦ �̻��Ҷ� ���� �������̽�
		while(iterator.hasNext()) { //�ڷ� ����ŭ �ݺ��ϰԵȴ�.
			String name = iterator.next();
			System.out.println("�̸� : " + name);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
