package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class test {

    public static void main(String[] args) {
      /*  List<String> fatherlist=new LinkedList<>();
        List<String> childlist=new ArrayList<>();
        childlist.add("before add");
        childlist.add("before add2");
        System.out.println(childlist.toString());
*/

       List<String> list= new ArrayList<>();
       list.add("111");
       list.add("2231");
        list.add("44");

       String[] array=new String[2];
       array=list.toArray(array);

       for(String s:array){
           System.out.println(s);
       }


       /* String[] strings=new String[]{"you","ss"};
        List list= Arrays.asList(str);
        list.add("sadasd");*/

    /*    fatherlist.addAll(childlist);
        childlist.add("after add");

        for (int i = 0; i <fatherlist.size() ; i++) {
            System.out.println(fatherlist.get(i));
        }*/
    }
}
