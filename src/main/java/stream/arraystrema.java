package stream;

import java.util.Arrays;
import java.util.List;

public class arraystrema {


    public static void main(String[] args) {
        String [] strArray = new String[] {"a", "b", "c"};

        System.out.println(strArray);

        List<String> list = Arrays.asList(strArray);
        System.out.println(list);
    }
}
