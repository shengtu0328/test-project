package stream;

import java.util.Optional;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-01-25 15:12
 **/
public class optioneltest {









    public static void main(String[] args) {
        //调用工厂方法创建Optional实例
        User u1= new User();

        User u2= new User();
        u2.setName("aaaa");


        System.out.println(Optional.ofNullable(u1.getName()).orElse("没有姓名"));
        System.out.println(Optional.ofNullable(u2.getName()).orElse("没有姓名"));

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
