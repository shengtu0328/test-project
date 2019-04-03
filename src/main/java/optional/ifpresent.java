package optional;

import java.util.Optional;

public class ifpresent {


    public static void main(String[] args) {


        User u=new User();
       u.setName("123456");
        Optional.ofNullable(u.getName());
        Optional.ofNullable(u.getName()).ifPresent(c->{
            System.out.println(c.substring(2));
        } );
    }
}
