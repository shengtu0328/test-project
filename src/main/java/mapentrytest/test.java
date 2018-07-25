package mapentrytest;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class test {

    public static void main(String[] args) {


        LinkedHashMap<String,String> map =new LinkedHashMap<>();
        map.put("1","2");
        map.put("3","4");
        map.put("5","6");
        map.put("7","8");


        Set<Map.Entry<String, String>> entrySet = map.entrySet();



        Iterator<Map.Entry<String, String>> it2 = entrySet.iterator();


        while (it2.hasNext()) {
            //获取Map.Entry关系对象me
            Map.Entry<String, String> me = it2.next();
            //通过关系对象获取key
            String key2 = me.getKey();
            //通过关系对象获取value
            String value2 = me.getValue();
            System.out.println("key: " + key2 + "-->value: " + value2);
        }






    }
}
