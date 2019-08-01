package ListObject转ListString;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: rqxiao
 * @Date: 2019-7-26 14:02
 * @Description:
 */
public class test {



    public static void main(String[] args) {
        List<Object> list=new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        String aa="";

        StringBuilder stringBuilder=new StringBuilder();

        list.stream().map(
               x->stringBuilder.append(x)
        );
        String s = list.toString();
        System.out.println(s);

    }


    public  static  List<String> aa(List list){

        return list;

    }



}
