//package lambda;
//
//public class TestFIMain {
//
//    public static void main(String[] args) {
//        TestBean1 bean1=new TestBean1();
//        bean1.test1(TestBean1::expect1);//①
//        bean1.test1(TestBean1::expect2);//② ok
//        bean1.test1(TestBean2::expect1);//③
//        bean1.test1(TestBean2::expect2);//④
//
//        TestBean2 bean2=new TestBean2();
//        bean2.test1(TestBean1::expect1);//⑤
//        bean2.test1(TestBean1::expect2);//⑥ ok
//        bean2.test1(TestBean2::expect1);//⑦
//        bean2.test1(TestBean2::expect2);//⑧
//    }
//}
