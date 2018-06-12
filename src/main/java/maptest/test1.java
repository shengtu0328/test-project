package maptest;

import java.util.HashMap;
import java.util.Map;

public class test1 {

    public static void main(String[] args) {
        Map m= new HashMap<>();
        m.put("1","a");
        m.put("2","b");

        System.out.println(m.get("2"));

    }
}
