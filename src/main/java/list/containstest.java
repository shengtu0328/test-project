package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-02-13 14:54
 **/
public class containstest {

    public static void main(String[] args) {
         List<String> list= new ArrayList<>();  //最终结果
        list.add("2131");
        list.add("2231");

        System.out.println(list.contains("2131"));
        System.out.println(list.contains("2331"));

    }
}
