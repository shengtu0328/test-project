package inner;

import java.util.ArrayList;
import java.util.List;

public interface jiekou1 {

    public abstract  void a();

    default void c(){
        System.out.println("cccc");
    }

    public abstract  void b(String aa );
    public static void main(String[] args) {

        jiekou1 j=new jiekou1(){
            public void a(){
                System.out.println("saa");
            }

            @Override
            public void b(String aa) {
                System.out.println(aa);
            }

            public void c(){
                System.out.println("c++");
            }

        };

        j.a();
        j.b("asdadadas");
        j.c();


        List a=new ArrayList<>();
        a.stream().forEach(System.out::println);
    }
}
