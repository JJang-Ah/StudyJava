package JavaObject;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationEx1 {

	public static void main(String[] args) {

		//안드로이드 앱개발 할때에는 어노테이션을 신경쓰지 않는다.
		// 기본적으로 자동으로 어노테이션이 붙는 기능이 있기때문이다.
		
		Method[] declareShoots = Shooting.class.getDeclaredMethods();
		//메소드 배열을 처리
		for(Method m:declareShoots) {
			if(m.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation annotation=m.getAnnotation(PrintAnnotation.class);
				System.out.println("[" + m.getName() + "]");
				try {
					m.invoke(new Shooting());
				}catch(Exception e) {
					System.out.println("오류 발생");
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
