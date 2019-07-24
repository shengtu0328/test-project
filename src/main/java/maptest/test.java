package maptest;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: rqxiao
 * @Date: 2019-6-26 15:10
 * @Description:
 */
public class test {


    Map m= new HashMap<>();


    HashMap<String, String > h = new HashMap<String, String>(){{
        put("a","b");
    }};


    public Map    getM(){


        Map mm=m;
        mm.put("1","2");
        return mm;
    }


    public static void main(String[] args) {
        test t=new test();

        Map m = t.getM();
        System.out.println(m);
        System.out.println(m.toString());

        Map m1 = t.m;
        System.out.println(m1);

    }
}
