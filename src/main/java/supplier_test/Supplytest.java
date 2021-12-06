package supplier_test;

import java.util.function.Supplier;

/**
 * @Description: TODO
 * @Author rqxiao
 * @date 2021/1/6 16:26
 */
public class Supplytest {


    public void test(Supplier supplier) {
        System.out.println(supplier.get());
    }

    public static void main(String[] args) {

//        Supplier d3 = new Supplier<String>() {
//            @Override
//            public String get() {
//                String s = "aa";
//                return s;
//            }
//        };
//        System.out.println(d3.get());



         Supplier d3 = new Supplier<String>() {
            @Override
            public String get() {
                String s = "aa";

                Apple apple=new Apple();
                apple.getType1();
                return s;
            }
        };
        System.out.println(d3.get());




        Supplytest supplytest = new Supplytest();
        supplytest.test(() -> {
            return String.valueOf(33333333);
        });

        supplytest.test(String::new);

        supplytest.test(new Apple()::getType1);


        supplytest.test(Apple::staitcGetType1);

    }

}
