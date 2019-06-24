package linkedlist;

/**
 * @Auther: rqxiao
 * @Date: 2019-6-21 14:03
 * @Description:
 */
public class User {



    public static void main(String[] args) {








        User ul=null;


        User u2=ul;

         ul=new User();

        System.out.println(u2);


        User u3=new User();


        User u4=u3;
        System.out.println(u4);
        String text="aaa";
        u4.foo(text);
        System.out.println(text);

    }

    void foo(String text) {
        text = "windows";
        System.out.println(text);
    }
}
