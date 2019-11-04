package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: rqxiao
 * @Date: 2019-10-30 15:11
 * @Description:
 */
public class addalltest {


    public static void main(String[] args) {


        List<String> list1=new ArrayList<>();


        list1.add("1");



        List<String> list234=new ArrayList<>();
        list234.add("2");
        list234.add("3");
        list234.add("4");

        list1.addAll(list234);



        List<String> list56=new ArrayList<>();
        list56.add("5");
        list56.add("6");

        list1.addAll(list56);

        System.out.println(list1);


    }
}
