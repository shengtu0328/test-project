package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: rqxiao
 * @Date: 2019-9-12 09:36
 * @Description:
 */
public class listatolistb {










    public static void main(String[] args) {

        A a1=new A ();
        a1.setName("name1");
        a1.setAge("age1");

        A a2=new A ();
        a2.setName("name2");
        a2.setAge("age2");
        List<A> lista=new ArrayList<>();
        lista.add(a1);
        lista.add(a2);


        List<B> listb=new ArrayList<>();

        listb = (List)(Object)lista;


    }
}
