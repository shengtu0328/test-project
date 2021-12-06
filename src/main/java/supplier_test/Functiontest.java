package supplier_test;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @Description: TODO
 * @Author rqxiao
 * @date 2021/1/6 16:26
 */
public class Functiontest {

     public void test(Integer integer,Function<Integer, String> function){
         System.out.println(function.apply(integer));
     }



    public static void main(String[] args) {

//        Function<Integer, String> function = new Function<Integer, String>() {
//            @Override
//            public String apply(Integer integer) {
//                return "string:" + integer;
//            }
//        };
//
//        String apply = function.apply(890);
//        System.out.println(apply);


        Functiontest functiontest=new Functiontest();
        functiontest.test(88,(x)->"string:" +x);


        functiontest.test(88,Apple::getType3);

    }



}
