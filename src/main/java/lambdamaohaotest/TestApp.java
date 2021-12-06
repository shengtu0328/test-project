package lambdamaohaotest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class TestApp {

    private String a;

    private String b;

    public TestApp() {
    }

    public TestApp(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public static void testA(String a) {
        System.out.println(a);
    }

    public static void testB(String a, String b) {
        System.out.println(a + b);
    }

    public static String testC(String a, String b) {
        return a + b;
    }

    public static TestApp test3(int a, int b, int d,int e) {
        return new TestApp(a + "", b + "");
    }


    public static TestApp testd(String a, String b) {
        return new TestApp(a, b);
    }

    public static void main(String[] args) {
//        new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
        Consumer<String> a = TestApp::testA;
        a.accept("dadadada");

        BiConsumer<String, String> b = TestApp::testB;
        b.accept("1", "xrqrqrq");

        BiFunction<String, String, String> testC = TestApp::testC;
        String ottoot = testC.apply("1", "ottoot");


        BiFunction<String, String, TestApp> testd = TestApp::testd;
        TestApp jkjk = testd.apply("1", "jkjk");


        TestAppInterface aa=TestApp::test3;

        TestApp aa1 = aa.aa(1, 2, 3, 4);
    }
}
