import java.util.HashMap;
import java.util.Map;

public class Pair<T> {

    public static void main(String[] args) {
        /*Map<K,V> a=new HashMap<K,V>();
        a.put("1","1111");

        a.put("2","22222");

        a.put("3","33333");

*/
    }

    private T value;
    public T getValue() {
        return value;
    }
    public void setValue(T  value) {
        this.value = value;
    }

}
