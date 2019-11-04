package annotationtest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Annotion2
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface TestAnnotation {

    int i();

   String msg();

    String[] address() default {};

}
