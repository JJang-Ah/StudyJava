package JavaGeneric;

import java.util.ArrayList;
import java.util.List;

public class GenericEx2 {

	public static void main(String[] args) {

//		List list = new ArrayList();
//		list.add(2.5);
//		list.add("���ѹα�~");
//		list.add(5);
//		list.add(false);
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		List list = new ArrayList();
		list.add("�츮����");
		list.add("���ѹα�");
		list.add("��������");
		list.add("��������");
		String str = (String)list.get(1);
		
		List<String> list2 = new ArrayList(); 
		//���׸��� ����ϸ� ���� Ÿ�Ժ�ȯ�� �����ʾƵ��ȴ�.
		list2.add("�츮����");
		list2.add("���ѹα�");
		list2.add("��������");
		list2.add("��������");
		String str2 = list2.get(2);
		
		
	}

}
