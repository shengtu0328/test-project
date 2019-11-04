package annotationtest;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TestAnnotation(msg="s",i=2)
public class Test {

    @TestAnnotation(msg="SS",i=22)
    public String a;

    @TestAnnotation(msg="SS",i=22)
    public void t(){


        System.out.println("进入了t方法");
    }


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Test t=new Test();
        Class<? extends Test> aClass = t.getClass();
        Field[] declaredFields = t.getClass().getDeclaredFields();

        for (int i = 0; i < declaredFields.length; i++) {


            Field declaredField = declaredFields[i];
            boolean annotationPresent = declaredField.isAnnotationPresent(TestAnnotation.class);

            String name = declaredField.getName();


            System.out.println(annotationPresent);
        }

        Method t1 = aClass.getMethod("t", null);


        Object invoke = t1.invoke(t, null);


        Method enclosingMethod = aClass.getEnclosingMethod();


        Method[] methods = aClass.getMethods();

        TestAnnotation testAnnotation = t.getClass().getAnnotation(TestAnnotation.class);









        System.out.println(testAnnotation.address());
        System.out.println(testAnnotation.i());
        System.out.println(testAnnotation.msg());


        Method method = t.getClass().getMethod("t", new Class[]{});
        System.out.println(method.getAnnotation(TestAnnotation.class).i());
        System.out.println(method.getAnnotation(TestAnnotation.class).msg());
    }
}
