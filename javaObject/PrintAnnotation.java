package JavaObject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//������̼� ���� Ŭ����

@Target({ElementType.METHOD})  // Ÿ���� �Ǵ� �迭 Ÿ���� ���Ѵ�.
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation { //PrintAnnotation�� ������̼����� ����
	String value() default "=";
	int number() default 20;
	

	
}
