package statictest;

/**
 * @Author: rqxiao
 * @Date: 2020-4-21 15:21
 * @Description:
 */
public class A {


    private static String bb;




    public static void main(String[] args) {


        A a =new A();

        System.out.println(a.bb);

        a.bb="33";
        System.out.println(a.bb);



        A a2 =new A();

        System.out.println(a2.bb);
        a2.bb="44";
        System.out.println(a.bb);


    }

}
