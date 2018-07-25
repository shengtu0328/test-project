package optional;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    public static void main(String[] args) {
        User user1=new User();
        User user2=new User();

     /*   String name1 = user1.getName();
        String s = name1.toUpperCase();

     */  List<User> l=new ArrayList<User>();
        l.add(user1);
        l.add(user2);



        l.stream().map(u->u.getName()).map(name -> name.toUpperCase());
    }
}
