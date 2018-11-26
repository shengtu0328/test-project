package hashmaptale;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class test1 {

    public static void main(String[] args) {
        Map m= new HashMap<>();
        m.put("1","a");
        m.put("2","b");
        m.put(null,null);

        Map t= new Hashtable();
        t.put("1","a");
        t.put("2","b");
        //t.put(null,null);



        System.out.println(m.get("2"));
        System.out.println(16<<1);

    }
}
