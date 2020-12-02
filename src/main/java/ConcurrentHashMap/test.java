package ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: rqxiao
 * @Date: 2019-6-20 13:321222
 * @Description:
 */
public class test {

    public static void main(String[] args) {
        ConcurrentHashMap map =new ConcurrentHashMap();
        map.put(1,"aaa");
        map.get(1);
    }
}
