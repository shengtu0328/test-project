package optional;

import java.util.Optional;

/**
 * @Author: rqxiao
 * @Date: 2019-12-31 14:23
 * @Description:
 */
public class optionalmap {


    public static void main(String[] args) {


        User user=new User();
        user.setName("xrq");

//        user=null;
//        Optional.ofNullable(user).map(User::getName).ifPresent(x->System.out.println(x+"xaass"));


        String otto = Optional.ofNullable(user).map(x -> {

            System.out.println(x.getName() + "bbb");
            return x.getName() + "bbb";
        }).orElse("otto1");


        System.out.println(otto);


    }
}
