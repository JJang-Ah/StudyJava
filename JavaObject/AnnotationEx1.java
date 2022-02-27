package JavaObject;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationEx1 {

	public static void main(String[] args) {

		//�ȵ���̵� �۰��� �Ҷ����� ������̼��� �Ű澲�� �ʴ´�.
		// �⺻������ �ڵ����� ������̼��� �ٴ� ����� �ֱ⶧���̴�.
		
		Method[] declareShoots = Shooting.class.getDeclaredMethods();
		//�޼ҵ� �迭�� ó��
		for(Method m:declareShoots) {
			if(m.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation annotation=m.getAnnotation(PrintAnnotation.class);
				System.out.println("[" + m.getName() + "]");
				try {
					m.invoke(new Shooting());
				}catch(Exception e) {
					System.out.println("���� �߻�");
					e.getMessage();
				}
				for(int i=0; i<annotation.number(); i++) {
					System.out.print(annotation.value());
				}
				System.out.println();
			}
		}
	}

}
