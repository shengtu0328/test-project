package string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: rqxiao
 * @Date: 2019-9-17 09:50
 * @Description:
 */
public class sorttest {

    public static void main(String[] args) {

        List<String> list= new ArrayList();
        list.add("2019-03-01 00:00:00");

        list.add("2018-03-01 00:00:00");

        list.add("2018-01-01 00:00:00");
        list.add("2018-02-01 00:00:00");
        list.add("2019-04-01 00:00:00");
        list.add("2000-04-01 00:00:00");

        list.add("2022-04-01 00:00:00");

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
