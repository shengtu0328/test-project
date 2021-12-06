package stream;

import lombok.Data;

import java.util.Optional;

import static junit.framework.TestCase.assertEquals;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-01-25 15:12
 **/
public class optioneltest {









    public static void main(String[] args) {

//        Integer i=null;
//        System.out.println(i);
//
//        Integer a=900000000;
     //   System.out.println(a);

        //调用工厂方法创建Optional实例
//        User u1= new User();
//    Optional.ofNullable(u1).ifPresent(System.out::println);


        User u3= new User();
        u3.name="u3 name";

        u3.name=null;

        u3=null;
        String name1 = Optional.ofNullable(u3).orElseThrow(() -> new RuntimeException("课程不存在1")).getName();

        String name2= Optional.ofNullable(u3).map(User::getName).orElseThrow(() -> new RuntimeException("名称不存在"));




        User u2= new User();
        u2.setName("namaeee");


        Optional.ofNullable(u2).ifPresent(System.out::println);

        Optional.ofNullable(u2).orElseThrow(() -> new RuntimeException("课程不存在"));

        Optional.ofNullable(u2).map(User::getName).orElseThrow(() -> new RuntimeException("课程不存在"));

        String s = Optional.ofNullable(u2).map(User::getName).orElse("123");

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

@Data
 class User{

    String name;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }
