package annotationtest;

import java.lang.reflect.Method;

@TestAnnotation(msg="s",i=2)
public class Test {


    @TestAnnotation(msg="SS",i=22)

    public void t(){

    }


    public static void main(String[] args) throws NoSuchMethodException {
        Test t=new Test();
        TestAnnotation testAnnotation = t.getClass().getAnnotation(TestAnnotation.class);
        System.out.println(testAnnotation.address());
        System.out.println(testAnnotation.i());
        System.out.println(testAnnotation.msg());


        Method method = t.getClass().getMethod("t", new Class[]{});
        System.out.println(method.getAnnotation(TestAnnotation.class).i());
        System.out.println(method.getAnnotation(TestAnnotation.class).msg());
    }
}
