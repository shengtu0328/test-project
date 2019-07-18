package stream;

import java.util.Optional;

import static junit.framework.TestCase.assertEquals;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-01-25 15:12
 **/
public class optioneltest {









    public static void main(String[] args) {

        Integer i=null;
        System.out.println(i);

        Integer a=900000000;
     //   System.out.println(a);

        //调用工厂方法创建Optional实例
//        User u1= new User();
//    Optional.ofNullable(u1).ifPresent(System.out::println);


        User u2= new User();
        //u2.setName("namaeee");

        Optional.ofNullable(u2).ifPresent(System.out::println);


        System.out.println(Optional.ofNullable(u2.getName()).isPresent());
        Optional.ofNullable(u2.getName()).ifPresent(System.out::println);



//
//        User u3=null;
//
//
//
//        System.out.println(Optional.ofNullable(u2.getName()).get());
//
//        System.out.println(Optional.ofNullable(u3.getName()).orElse("没有姓名"));

      //  System.out.println(Optional.ofNullable(null).orElse(100));
    }
}

 class User{

    String name;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }
