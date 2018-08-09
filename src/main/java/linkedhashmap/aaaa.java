package linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class aaaa {

    public static void main(String[] args) {
        HashMap map=new LinkedHashMap();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");
        map.put("5","e");
        map.put("6","f");
        map.put("7","g");
        map.put("8","h");
        map.put("9","i");
        map.put("10","j");
        map.put("11","k");
        map.put("12","l");
        map.put("13","m");
        map.put("14","n");



        Set<Map.Entry<String, String>> entrys=map.entrySet();
        entrys.stream().forEach(entry->System.out.println( entry.getKey() + entry.getValue()));
/*
        StringBuilder credentials = new StringBuilder().append("---");
        map.values().stream().forEach(c -> credentials.append(c));




        System.out.println(credentials);*/
    }
}
