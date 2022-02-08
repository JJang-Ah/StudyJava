package JavaObject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//어노테이션 연계 클래스

@Target({ElementType.METHOD})  // 타겟이 되는 배열 타입을 정한다.
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation { //PrintAnnotation를 어노테이션으로 만듦
	String value() default "=";
	int number() default 20;
	

	
}
