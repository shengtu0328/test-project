package string;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: rqxiao
 * @Date: 2019-12-12 10:12
 * @Description:
 */
public class douhao {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Milan", "London", "New York", "San Francisco");
        String citiesCommaSeparated = String.join(",", cities);
        System.out.println(citiesCommaSeparated);

    }
}
