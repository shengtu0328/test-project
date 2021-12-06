//package extendsSuper;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class ExtendsTest {
//
//    public static void main(String[] args) {
//
//
//        //--------------------------extends--------------------------
//        //放Number及Number的子类具体是Number的哪个子类不确定，所以只具有放null的能力，主要用来读取数据，以下都是合法的赋值方式
//        List<? extends Number> foo0 = new ArrayList<Integer>() {
//            {
//                this.add(123);
//                this.add(1234);
//            }
//        };
//        List<? extends Number> foo1 = new ArrayList<Number>() {
//            {
//                this.add(123);
//                this.add(1234);
//            }
//        };
//        List<? extends Number> foo2 = new ArrayList<Double>() {
//            {
//                this.add(123d);
//                this.add(1234d);
//            }
//        };
//        List<? extends Number> foo3 = new ArrayList<Float>() {
//            {
//                this.add(123f);
//                this.add(1234f);
//            }
//        };
//        List<? extends Number> foo4 = new ArrayList<Short>() {
//            {
//                this.add(new Short((short) 12));
//                this.add(new Short((short) 24));
//            }
//        };
////        foo0.add(123);   //报错，不能放入数据
////        foo2.add(123d);  //报错，不能放入数据
////        foo3.add(123f);  //报错，不能放入数据
////        foo4.add(new Short((short)12))//报错，不能放入数据
//
////        只能放入引用类型的默认值null
//        foo0.add(null);   //正确
//        foo2.add(null);  //正确
//        foo3.add(null);  //正确
//        foo4.add(null);  //正确
//
//        Number number = foo0.get(0);
//
//
//        //--------------------------super--------------------------
//        //放Number及Number的超类具体是除了Number之外的的哪个超类不确定,擦除到Number,只能存放Number及其子类，多态
//        List<? super Number> foo5 = new ArrayList<Number>() {
//            {
//                this.add(123.0);
//                this.add(567);
//                this.add(234);
//            }
//        };
//        foo5.add(new BigDecimal("100.23"));
//
//        List<? super Number> foo6 = new ArrayList<Object>() {
//            {
//                this.add(123.0);
//                this.add(567);
//                this.add(234);
//
//
//            }
//        };
//        //foo1.add(new Object());错误，若能放Object，则根据多态，String类型也能放，不符合泛型规则
//        foo6.add(new BigDecimal("100.23"));
//
//
//
//        foo6.add(new Object());
//        foo6.add(new AtomicInteger(1));
//
//
//
//
//
//        System.out.println(foo1);
//
//
//    }
//}
