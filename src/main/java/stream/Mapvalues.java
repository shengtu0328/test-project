package stream;

import java.util.HashMap;
import java.util.Map;

public class Mapvalues {

    public static void main(String[] args) {
        Map m =new HashMap<>();
        m.put("a","1");
        m.put("b","c");
      StringBuilder aa=new StringBuilder();

        m.values().stream().forEach( v->aa.append(v));

        System.out.println(aa);
    }
}
