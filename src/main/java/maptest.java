import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: rqxiao
 * @Date: 2019-6-26 15:10
 * @Description:
 */
public class maptest {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map<String, String> map = new HashMap<String, String>();

        map.put("hollis1", "hollischuang");
        map.put("hollis2", "hollischuang");
        map.put("hollis3", "hollischuang");

        map.put("hollis4", "hollischuang");
        map.put("hollis5", "hollischuang");
        map.put("hollis6", "hollischuang");

        map.put("hollis7", "hollischuang");
        map.put("hollis8", "hollischuang");
        map.put("hollis9", "hollischuang");
        map.put("hollis10", "hollischuang");
        map.put("hollis11", "hollischuang");
        show(map);

        map.put("hollis12", "hollischuang");
        show(map);

        map.put("hollis13", "hollischuang");
        show(map);

        map.put("hollis14", "hollischuang");


        show(map);

    }

    private static void show(Map<String, String> map) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        System.out.println("size:"+map.size());

        Class<HashMap> mapType = HashMap.class;
        Method capacity = mapType.getDeclaredMethod("capacity");
        capacity.setAccessible(true);


        System.out.println("capacity:"+capacity.invoke(map));

    }
}
