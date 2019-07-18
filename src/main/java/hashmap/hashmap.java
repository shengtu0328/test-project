package hashmap;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        StringBuffer response2=null;
        StringBuffer response = new StringBuffer();
        System.out.println("response    "+response);
        System.out.println("response2   "+response2);

        map.put("1","a");
        System.out.println("remove的结果"+map.remove("1"));
        System.out.println(map);
    }
}
